package com.csair.b2c.cloud.test.plugin;

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

import com.csair.b2c.cloud.test.learn.java.bytecode.ClassFileReader;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成编译时注解处理器的描述文件javax.annotation.processing.Processor
 *
 * @author yudong
 */
@Mojo(name = "geneateServicesFile", defaultPhase = LifecyclePhase.PREPARE_PACKAGE)
public class GenerateServicesFileMojo extends AbstractMojo {
    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File directory;
    @Parameter(defaultValue = "${project.build.outputDirectory}", property = "outputDir", required = true)
    private File outputDirectory;
    @Parameter(defaultValue = "${project.build.sourceDirectory}", property = "outputDir", required = true)
    private File sourceDirectory;
    @Parameter(property = "outputDir")
    private static String[] includes;

    private static List<File> javaFiles = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        String path = "D:\\b2c\\b2c-cloud-test-parent-foundmental\\b2c-cloud-test-annotation-processor\\target\\classes";

        List<File> javaClassFiles = getJavaClassFiles(Paths.get(path));
        for (File javaFile : javaClassFiles) {
            System.out.println(javaFile.getAbsolutePath());
        }
        GenerateServicesFileMojo generateServicesFileMojo = new GenerateServicesFileMojo();
        System.out.println(generateServicesFileMojo.getProcessorClassNames(javaClassFiles));
    }

    @Override
    public void execute() throws MojoExecutionException {
        List<File> javaClassFiles = new ArrayList<>();
        getAndfillJavaClassFiles(outputDirectory.getAbsolutePath(), javaClassFiles);

        File file = new File(outputDirectory, "META-INF/services");
        if (!file.exists()) {
            file.mkdirs();
        }
        getLog().info("file:" + file.getAbsolutePath());

        getLog().info("this is a special plugin by yudong");
        getLog().info("${project.build.directory}:" + directory);
        getLog().info("${project.build.outputDirectory}:" + outputDirectory);
        getLog().info("${project.build.sourceDirectory}:" + sourceDirectory);


        File processorFile = new File(file, "javax.annotation.processing.Processor");
        try {
            processorFile.createNewFile();
        } catch (Exception e) {
            throw new MojoExecutionException("error", e);
        }

        List<String> className = getProcessorClassNames(javaClassFiles);
        FileWriter w = null;
        try {
            w = new FileWriter(processorFile);
            for (String s : className) {
                w.write(s + "\r\n");
            }
        } catch (IOException e) {
            throw new MojoExecutionException("Error creating file " + processorFile, e);
        } finally {
            if (w != null) {
                try {
                    w.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }

    }

    public static List<File> getJavaClassFiles(Path dir) throws Exception {
        List<File> javaClassFiles = new ArrayList<>();
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.toString().endsWith(".class")) {
                    javaClassFiles.add(file.toFile());
                }
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                return FileVisitResult.CONTINUE;
            }
        });
        return javaClassFiles;
    }

    public static void getAndfillJavaClassFiles(String dir, List<File> javaFiles) {
        File file = new File(dir);
        File[] files = file.listFiles();
        for (File tempFile : files) {
            if (tempFile.isDirectory()) {
                getAndfillJavaClassFiles(tempFile.getAbsolutePath(), javaFiles);
            } else {
                if (tempFile.getName().endsWith(".class")) {
                    javaFiles.add(tempFile);
                }
            }
        }
    }

    public List<String> getProcessorClassNames(List<File> javaClassFiles) {
        try {
            List<String> classNames = new ArrayList<>();
            for (File file : javaClassFiles) {
                ClassFileReader classFileReader = new ClassFileReader(new FileInputStream(file));
                String className = classFileReader.getClassName();
                String superClassName = classFileReader.getSuperClassName();
                boolean isAnnotationProcessor = superClassName.equals("javax.annotation.processing.AbstractProcessor");
                if (isAnnotationProcessor) {
                    classNames.add(className);
                }
            }
            return classNames;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
