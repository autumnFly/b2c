package com.csair.b2c.cloud.test.learn.java.dynamiccompiler;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
public class DynamicClassLoader extends ClassLoader {
    private byte[] classBytes;

    public DynamicClassLoader(byte[] classBytes) {
        super(DynamicClassLoader.class.getClassLoader());
        this.classBytes = classBytes;
    }

    @Override
    protected Class<?> findClass(String name) {
        Class<?> cl = defineClass(name, classBytes, 0, classBytes.length);
        return cl;
    }

}
