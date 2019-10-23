package com.csair.b2c.cloud.test.dubbo.provider.dubbo.impl;

import cn.com.bluemoon.service.user.service.SsoService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.csair.b2c.cloud.test.dubbo.provider.api.model.User;
import com.csair.b2c.cloud.test.dubbo.provider.api.service.UserDubboService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@Service(version = "1.0.0")
public class UserDubboServiceImpl implements UserDubboService {


    @Reference(timeout = 30000)
    private SsoService ssoService;

    @Override
    public List<User> queryAll() {
        List<User> users = new ArrayList<>(3);
        users.add(new User(001L, "yu", "123yu", 23));
        users.add(new User(002L, "yudong", "123yudong", 24));
        users.add(new User(002L, "liangyudong", "123liangyudong", 25));
        return users;
    }

    @Override
    public Map<String, Object> query(List<Integer> empCodes) {
        Map<String, Object> empInfo1 = new HashMap<>();
        empInfo1.put("empCode", 80526611);
        empInfo1.put("havaQuit", 1);
        Map<String, Object> empInfo2 = new HashMap<>();
        empInfo2.put("empCode", 80231671);
        empInfo2.put("havaQuit", 1);
        Map<String, Object> empInfo3 = new HashMap<>();
        empInfo3.put("empCode", 80546269);
        empInfo3.put("havaQuit", 0);
        List<Object> list = new ArrayList<>();
        list.add(empInfo1);
        list.add(empInfo2);
        list.add(empInfo3);
        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        return map;
    }
}
