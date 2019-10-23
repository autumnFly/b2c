package com.csair.b2c.cloud.test.learn.java.bytecodetools;

import com.csair.b2c.cloud.test.learn.java.highquality.Son;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.CtNewConstructor;
import javassist.CtNewMethod;
import javassist.Modifier;
import org.springframework.util.ResourceUtils;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class JavaasistTest {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("com.csair.b2c.cloud.test.learn.java.thinking.Son");
        cc.setSuperclass(pool.get("com.csair.b2c.cloud.test.learn.java.thinking.Person"));

        CtMethod ctMethod = cc.getDeclaredMethod("isHasLisense");
        ctMethod.insertBefore(String.format("System.out.println(\"%s方法被调用\");", ctMethod.getName()));

        CtMethod ctMethod1 = cc.getDeclaredMethod("setHasLisense");
        ctMethod1.insertBefore(String.format("System.out.println(\"%s方法被调用,参数为:\"+$1);", ctMethod.getName()));

        Son son = ((Son) cc.toClass().newInstance());
        son.isHasLicense();
        son.setHasLicense(true);

        CtClass ccNew = pool.makeClass("com.csair.b2c.cloud.test.learn.java.thinking.GrandSon");
        ccNew.setSuperclass(pool.get("com.csair.b2c.cloud.test.learn.java.thinking.Son"));
        CtField f = new CtField(CtClass.intType, "dymamicAge", ccNew);
        f.setModifiers(Modifier.PRIVATE);
        ccNew.addField(f);
        CtConstructor ctConstructor = CtNewConstructor.make("public GrandSon(int i){this.dymamicAge=i;}", ccNew);
        ccNew.addConstructor(ctConstructor);
        CtMethod mthd = CtNewMethod.make("public int getInteger() { return dymamicAge; }", ccNew);
        ccNew.addMethod(mthd);
        Class clazz = ccNew.toClass(JavaasistTest.class.getClassLoader(),null);
        Object object = clazz.getDeclaredConstructor(int.class).newInstance(3);
        System.out.println(clazz.getDeclaredMethod("getInteger").invoke(object));

        String path = ResourceUtils.getFile("classpath:").getAbsolutePath();
        cc.writeFile(path);
        ccNew.writeFile(path);

    }
}
