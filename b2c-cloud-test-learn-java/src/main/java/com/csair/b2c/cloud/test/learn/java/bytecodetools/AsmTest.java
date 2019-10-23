package com.csair.b2c.cloud.test.learn.java.bytecodetools;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class AsmTest {
    public static void main(String[] args) throws Exception {
        ClassReader classReader = new ClassReader("com.csair.b2c.cloud.test.learn.java.model.Person");
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        JavaClassAdapter javaClassAdapter = new JavaClassAdapter(classWriter);
        classReader.accept(javaClassAdapter, ClassReader.SKIP_DEBUG);

        // 插入新方法
        MethodVisitor helloVisitor = classWriter
                .visitMethod(Opcodes.ACC_PUBLIC, "sayHello", "()V", null, new String[]{"javax.validation.ValidationException"});
        helloVisitor.visitCode();
        helloVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        helloVisitor.visitLdcInsn("hello world!");
        helloVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
        helloVisitor.visitInsn(Opcodes.RETURN);
        helloVisitor.visitMaxs(1, 1);
        helloVisitor.visitEnd();

        byte[] bytes = classWriter.toByteArray();

        String path = ResourceUtils.getFile("classpath:").getAbsolutePath();
        File file = new File(path, "/com/csair/b2c/cloud/test/learn/java/thinking/PersonModify.class");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

}
