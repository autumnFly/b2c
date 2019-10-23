package com.csair.b2c.cloud.test.dubbo.provider;


import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于调用被Spring管理的任何类的任何方法
 *
 * @author yudong
 */
@RestController
@RequestMapping("/api")
public class InvokerController {

    private static List<String> typesName = new ArrayList<>();

    static {
        typesName.add("java.lang.String");
        typesName.add("java.lang.Boolean");
        typesName.add("java.lang.Byte");
        typesName.add("java.lang.Short");
        typesName.add("java.lang.Integer");
        typesName.add("java.lang.Long");
        typesName.add("java.lang.Float");
        typesName.add("java.lang.Double");
    }

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/invoke/{beanName}/{methodName}")
    public Object invoke(@RequestBody JSONObject reqParams,
                         @PathVariable String beanName,
                         @PathVariable String methodName) throws Exception {
        Object service = context.getBean(beanName);
        Class clz = service.getClass();
        Object result = null;
        for (Method declaredMethod : clz.getDeclaredMethods()) {
            if (!declaredMethod.getName().equals(methodName)) {
                continue;
            }
            Object[] params = new Object[declaredMethod.getParameterCount()];
            for (int i = 0; i < declaredMethod.getParameterTypes().length; i++) {
                if (declaredMethod.getParameterTypes()[i].isPrimitive()) {
                    params[i] = reqParams.get("arg" + i);
                    continue;
                }
                if (typesName.contains(declaredMethod.getParameterTypes()[i].getTypeName())) {
                    params[i] = reqParams.get("arg" + i);
                    continue;
                }
                Object param = JSONObject.toBean(reqParams.getJSONObject("arg" + i), declaredMethod.getParameterTypes()[i]);
                params[i] = param;
            }
            result = declaredMethod.invoke(service, params);
            break;
        }
        return result;
    }

}
