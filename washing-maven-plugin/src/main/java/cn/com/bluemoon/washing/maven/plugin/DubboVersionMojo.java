package cn.com.bluemoon.washing.maven.plugin;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultElement;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

// 要使用此目标需在pom文件中这样配置,并且maven命令行加上此参数-Dwashing.maven.plugin.profile=dev
//            <plugin>
//                 <groupId>cn.com.bluemoon.washing</groupId>
//                 <artifactId>washing.maven.plugin</artifactId>
//                 <version>1.0-SNAPSHOT</version>
//                 <configuration>
//                     <dubboXmlFileName>dubbo-provider.xml</dubboXmlFileName>
//                     <services>
//                         <service>cn.com.bluemoon.service.customermanage.api.OrderDubboForCustomerManageService:1.0.0-yudong</service>
//                     </services>
//                 </configuration>
//                 <executions>
//                     <execution>
//                         <goals>
//                             <goal>dubbo</goal>
//                         </goals>
//                     </execution>
//                 </executions>
//             </plugin>

/**
 *
 *
 *
 * 修改dubbo配置文件的service或reference的服务的version
 *
 * @author yudong
 */
@Mojo(name = "dubbo", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class DubboVersionMojo extends AbstractMojo {
    /**
     * pom文件所在的目录
     */
    @Parameter(defaultValue = "${project.basedir}", property = "outputDir", required = true)
    private File basedir;
    /**
     * target目录
     */
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File directory;
    /**
     * classes目录
     */
    @Parameter(defaultValue = "${project.build.outputDirectory}", property = "outputDir", required = true)
    private File outputDirectory;
    /**
     * src/main/java目录
     */
    @Parameter(defaultValue = "${project.build.sourceDirectory}", property = "outputDir", required = true)
    private File sourceDirectory;
    /**
     * dubbo配置文件名称(默认位于resources目录)
     */
    @Parameter(property = "outputDir", required = true)
    private String dubboXmlFileName;
    /**
     * dubbo配置文件编码,默认UTF-8
     */
    @Parameter(defaultValue = "UTF-8", property = "outputDir", required = true)
    private String dubboXmlFileEncode;
    /**
     * 服务接口完整名称及要修改的version的值,用:隔开
     */
    @Parameter(property = "outputDir", required = true)
    private String[] services;
    /**
     * 服务接口完整名称及要修改的version的值,用:隔开
     */
    @Parameter(property = "outputDir", required = true)
    private String[] references;

    @Override
    public void execute() throws MojoExecutionException {
        getLog().info("The plugin was made by yudong");
        String profile = System.getProperty("washing.maven.plugin.profile");
        getLog().info("washing.maven.plugin.profile:" + profile);
        if (!"dev".equals(profile)) {
            getLog().info("washing.maven.plugin.profile is not dev, the plugin target dubbo will not execute");
            getLog().info("add -Dwashing.maven.plugin.profile=dev to common line to active the plugin target");
            return;
        }
        getLog().info("dubboXmlFileName:" + dubboXmlFileName);
        getLog().info("services:" + Arrays.toString(services));
        getLog().info("references:" + Arrays.toString(references));
        File dubboXmlFile = new File(basedir + "/src/main/resources", dubboXmlFileName);
        if (!dubboXmlFile.exists()) {
            getLog().info("no " + dubboXmlFileName + " file found:" + dubboXmlFile.getAbsolutePath());
            return;
        }

        try {
            Document document = DocumentHelper.parseText(new String(Files.readAllBytes(dubboXmlFile.toPath()), dubboXmlFileEncode));

            for (String service : services) {
                String[] strings = service.split(":");
                findAndSetNewDubboVersion(document, "service", strings[0], strings[1]);
            }
            for (String reference : references) {
                String[] strings = reference.split(":");
                findAndSetNewDubboVersion(document, "reference", strings[0], strings[1]);
            }

            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding(dubboXmlFileEncode);
            File dubboOutputXmlFile = new File(outputDirectory, dubboXmlFileName);
            XMLWriter writer = new XMLWriter(new FileWriter(dubboOutputXmlFile), format);
            writer.write(document);
            writer.close();
        } catch (Exception e) {
            throw new MojoExecutionException("", e);
        }
    }

    private static void findAndSetNewDubboVersion(Document document, String type, String serviceName, String newVersion) {
        DefaultElement rootElement = (DefaultElement) document.getRootElement();
        List<Element> nodes = rootElement.elements(type, new Namespace("dubbo", "http://code.alibabatech.com/schema/dubbo"));
        for (Element node : nodes) {
            if (node.attribute("interface").getValue().trim().equals(serviceName)) {
                node.attribute("version").setValue(newVersion);
                break;
            }
        }
    }

}
