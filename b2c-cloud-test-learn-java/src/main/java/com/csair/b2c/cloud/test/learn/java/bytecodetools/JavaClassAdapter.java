package com.csair.b2c.cloud.test.learn.java.bytecodetools;


import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class JavaClassAdapter extends ClassAdapter {

    public JavaClassAdapter(ClassVisitor classVisitor) {
        super(classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(final int access, final String name,
                                     final String desc, final String signature, final String[] exceptions) {
        System.out.println("method:" + name);
        if (name.contains("test")) {
            // 去掉test方法
            return null;
        }
        if (!name.equals("stubMethod")) {
            return cv.visitMethod(access, name, desc, signature, exceptions);
        }
        String newDesc = "(Ljava.lang.String;)Ljava.lang.String";
        MethodVisitor methodVisitor = cv.visitMethod(access, name, newDesc, signature, exceptions);
        methodVisitor.visitCode();
        return methodVisitor;
    }

    @Override
    public FieldVisitor visitField(final int access, final String name,
                                   final String desc, final String signature, final Object value) {
        System.out.println("field:" + name);
        int newAccess = access;
        Object newValue = value;
        if (name.equals("hasLisense")) {
            // 修改实例域的访问权限
            newAccess = Opcodes.ACC_PROTECTED;
            newValue = Boolean.TRUE;
        }
        return cv.visitField(newAccess, name, desc, signature, newValue);
    }

    @Override
    public void visit(int i, int i1, String s, String s1, String s2, String[] strings) {
        String[] strs = new String[strings.length + 1];
        for (int k = 0; k < strings.length; k++) {
            strs[k] = strings[k];
        }
        // 修改继承的父类
        s2 = "com/csair/b2c/cloud/test/learn/java/thinking/Person";
        // 新增实现的接口
        strs[strings.length] = "java/lang/Cloneable";
        super.visit(i, i1, s, s1, s2, strs);
    }
}
