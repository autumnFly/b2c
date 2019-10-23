package com.csair.b2c.security.model;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.LayoutBase;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class FlumeLogLayout extends LayoutBase<ILoggingEvent> {
    private static String SERVER_IP = "";
    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss+0800";
	private String channel = "";
	

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String doLayout(ILoggingEvent eventObject) {
		String content = eventObject.getFormattedMessage();
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        //运维要求date开始
        map.put("date", DateFormatUtils.format(eventObject.getTimeStamp(), DATE_PATTERN));
        map.put("level", eventObject.getLevel().levelStr);
        if(eventObject.getThrowableProxy()!=null){
        	StringBuilder messageSb = appendThrowable(eventObject);
        	if(StringUtils.isNotBlank(messageSb)){
        		map.put("msg", content+","+messageSb.toString());
        	}else{
        		map.put("msg", content+","+eventObject.getThrowableProxy().getMessage());
        	}
        }else{
        	map.put("msg", content);
        }
        map.put("class", eventObject.getLoggerName());
        map.put("ip", SERVER_IP);
        if(StringUtils.isNotBlank(channel)){
        	map.put("channel", channel);
        }
         String interfaceName = "";
         String costTime = "";
        if(StringUtils.isNotBlank(interfaceName)&& StringUtils.isNotBlank(costTime)){
        	if(interfaceName.contains("?")){
        		interfaceName=interfaceName.substring(0, interfaceName.indexOf("?"));
        	}
        	map.put("interface", interfaceName);
        	map.put("costTime", costTime);
        }
        return JSON.toJSONString(map)+"\r\n";
	}

	/**
	 * 获取堆栈的异常信息
	 * @param loggingEvent
	 */
	 private StringBuilder appendThrowable(ILoggingEvent loggingEvent) {
        StringBuilder messageSb = new StringBuilder();
        IThrowableProxy proxy = loggingEvent.getThrowableProxy();
        //因考虑到服务器压力，暂只推堆栈信息的第一行
        messageSb.append(loggingEvent.getThreadName()).append(";");
        messageSb.append(proxy.getClassName()).append(":");
        messageSb.append(proxy.getMessage()).append(":");
        for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
            messageSb.append(element.getSTEAsString()).append(";");
            break;
        }
        appendCause(proxy,messageSb);
        return messageSb;
	 }
     private void appendCause(IThrowableProxy proxy,StringBuilder messageSb){
         if (proxy != null) {
             messageSb.append(proxy.getClassName()).append(":");
             messageSb.append(proxy.getMessage()).append(":");
             for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
                 messageSb.append(element.getSTEAsString()).append(";");
                 break;
             }
             appendCause(proxy.getCause(),messageSb);
         }
     }
}
