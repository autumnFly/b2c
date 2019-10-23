package com.csair.b2c.cloud.test.user.jmx;

import com.csair.b2c.cloud.test.common.model.UserDetailBean;

import javax.management.Notification;
import javax.management.NotificationListener;

/**
 * Created on 2019/4/14.<br/>
 *
 * @author yudong
 */
public class LoginListener implements NotificationListener {
    @Override
    public void handleNotification(Notification notification, Object handback) {
        UserDetailBean userDetailBean = ((UserDetailBean) notification.getSource());
        System.out.println("接收到jmx通知:" + userDetailBean.getUsername() + "已经登录到系统");
    }
}
