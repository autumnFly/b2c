package com.csair.b2c.cloud.test.dubbo.provider.api.model;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
public class User implements java.io.Serializable {
    private static final long serialVersionUID = -2668999377589717337L;
    private Long id;
    private String username;
    private String password;
    private Integer age;

    public User(Long id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
