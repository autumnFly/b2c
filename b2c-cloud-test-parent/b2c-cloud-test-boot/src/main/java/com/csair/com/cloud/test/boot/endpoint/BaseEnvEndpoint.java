// package com.csair.com.cloud.test.boot.endpoint;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.actuate.endpoint.EnvironmentEndpoint;
// import org.springframework.context.ApplicationContext;
// import org.springframework.stereotype.Component;
//
// import java.util.Map;
//
// /**
//  * Created on 2018/8/21.<br/>
//  *
//  * @author yudong
//  */
// @Component
// public class BaseEnvEndpoint extends EnvironmentEndpoint {
//     @Autowired
//     private ApplicationContext context;
//
//     @Override
//     public Map<String, Object> invoke() {
//         Map<String, Object> map = super.invoke();
//         context.getBeansOfType(EnvProps.class).values().forEach((action) -> {
//             map.put(action.name(), action.props());
//         });
//         return map;
//     }
// }
