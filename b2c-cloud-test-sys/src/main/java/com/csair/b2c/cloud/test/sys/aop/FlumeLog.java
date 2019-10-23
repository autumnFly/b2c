package com.csair.b2c.cloud.test.sys.aop;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created on 2018/8/20.<br/>
 *
 * @author yudong
 */
@Aspect
@Component
public class FlumeLog {

    private static String SERVER_IP = "";
    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss+0800";
    private String channel = "";

    @Pointcut("execution(* org.slf4j.Logger+.*(..))")
    public void point() {
    }

    @Around("point()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        Map<String, Object> map = new LinkedHashMap<>();
        try {
            map.put("date", DateFormatUtils.format(System.currentTimeMillis(), DATE_PATTERN));
            map.put("level", joinPoint.getSignature().getName());
            Object object = joinPoint.proceed(joinPoint.getArgs());
            map.put("msg", JSONObject.toJSON(object));
            map.put("class", joinPoint.getTarget().getClass());
            map.put("ip", SERVER_IP);
            map.put("channel", channel);
            String interfaceName = "";
            String costTime = "";
            if (interfaceName.contains("?")) {
                interfaceName = interfaceName.substring(0, interfaceName.indexOf("?"));
            }
            map.put("interface", interfaceName);
            map.put("costTime", costTime);
            return object;
        } catch (Throwable t) {
            StringBuilder messageSb = appendThrowable(t);
            map.put("msg", messageSb.toString());
            throw t;
        }
    }

    private StringBuilder appendThrowable(Throwable t) {
        StringBuilder messageSb = new StringBuilder();
        //因考虑到服务器压力，暂只推堆栈信息的第一行
        messageSb.append(Thread.currentThread().getName()).append(";");
        messageSb.append(t.getClass().getName()).append(":");
        messageSb.append(t.getMessage()).append(":");
        appendCause(t.getCause(), messageSb);
        return messageSb;
    }

    private void appendCause(Throwable cause, StringBuilder messageSb) {
        if (cause != null) {
            messageSb.append(cause.getClass().getName()).append(":");
            messageSb.append(cause.getMessage()).append(":");
            appendCause(cause.getCause(), messageSb);
        }
    }

}
