package com.csair.b2c.test.mybatis.utils;

import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.exception.ShellException;

import java.io.File;

/**
 * @author yudong
 * @date 2019/5/29
 */
public class JavaShellCallback implements ShellCallback {
    String baseDir;

    public JavaShellCallback(String baseDir) {
        this.baseDir = baseDir;
    }

    @Override
    public File getDirectory(String targetProject, String targetPackage) throws ShellException {
        targetPackage = targetPackage.replace(".", "/");
        String dir = baseDir + "/" + targetProject + "/" + targetPackage;
        return new File(dir);
    }

    @Override
    public String mergeJavaFile(String newFileSource, File existingFile, String[] javadocTags, String fileEncoding) throws ShellException {
        return null;
    }

    @Override
    public void refreshProject(String project) {

    }

    @Override
    public boolean isMergeSupported() {
        return false;
    }

    @Override
    public boolean isOverwriteEnabled() {
        return true;
    }
}
