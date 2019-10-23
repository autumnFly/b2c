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

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Goal which touches a timestamp file.
 *
 * @author yudong
 */
@Mojo(name = "touch", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class PluginMojo extends AbstractMojo {
    /**
     * Location of the file.
     */
    @Parameter(defaultValue = "${project.build.directory}", property = "outputDir", required = true)
    private File directory;
    @Parameter(defaultValue = "${project.build.outputDirectory}", property = "outputDir", required = true)
    private File outputDirectory;
    @Parameter(defaultValue = "${project.build.sourceDirectory}", property = "outputDir", required = true)
    private File sourceDirectory;
    @Parameter(defaultValue = "", property = "outputDir", required = false)
    private String[] includes;

    @Override
    public void execute() throws MojoExecutionException {
        File f = directory;

        if (!f.exists()) {
            f.mkdirs();
        }

        getLog().info("this is a special plugin by yudong");
        getLog().info("includes:" + Arrays.toString(includes));

        File touch = new File(f, "touch.txt");
        File timeFIle = new File(outputDirectory, "application.yml");


        FileWriter w = null;
        FileWriter w1 = null;
        try {
            w = new FileWriter(touch);
            w.write("how cool this is!" + Arrays.toString(includes));

            getLog().info("path:" + timeFIle.getPath());

            byte[] bytes = Files.readAllBytes(timeFIle.toPath());
            String s = new String(bytes, "UTF-8");
            s = s.replace("${plugin.pachagetime}", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));

            w1 = new FileWriter(timeFIle);
            w1.write(s);

        } catch (IOException e) {
            throw new MojoExecutionException("Error creating file " + touch, e);
        } finally {
            if (w1 != null) {
                try {
                    w.close();
                    w1.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }

    }
}
