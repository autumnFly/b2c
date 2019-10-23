package com.csair.b2c.cloud.test.learn.maven.model;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.learn.maven.validation.SecondCheck;
import org.hibernate.validator.constraints.NotBlank;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account implements HttpSessionBindingListener {
    @NotNull
    @Size(min = 2, max = 10)
    private String id;
    @NotBlank
    private String pwd;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", groups = SecondCheck.class)
    private String email;
    @NotBlank(groups = SecondCheck.class)
    private String showName;
    private boolean activated;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("bound:" + event.getName() + ":" + event.getValue() + ":" + event.getSession().getId());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("unbound:" + event.getName() + ":" + event.getValue() + ":" + event.getSession().getId());
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, true);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
