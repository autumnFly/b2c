package com.csair.b2c.cloud.test.learn.java.bytecodetools;

import com.csair.b2c.cloud.test.learn.java.model.Person;
import com.csair.b2c.cloud.test.learn.java.utils.OMUtils;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class CglibTest {
    public static void main(String[] args) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println(String.join("", "调用了", method.getName(), "方法"));
            Object object = methodProxy.invokeSuper(o, objects);
            return object;
        });
        Person person = ((Person) enhancer.create());
        person.setName("Jack");
        System.out.println(OMUtils.objectMapper.writeValueAsString(person));
    }
}
