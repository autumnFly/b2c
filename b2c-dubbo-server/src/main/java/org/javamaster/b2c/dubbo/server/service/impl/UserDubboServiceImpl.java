package org.javamaster.b2c.dubbo.server.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.javamaster.b2c.dubbo.server.api.dto.UserDto;
import org.javamaster.b2c.dubbo.server.api.service.UserDubboService;

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


    @Override
    public List<UserDto> queryAll() {
        List<UserDto> users = new ArrayList<>(3);
        users.add(new UserDto(1L, "yu", "123yu", 23));
        users.add(new UserDto(2L, "yudong", "123yudong", 24));
        users.add(new UserDto(2L, "liangyudong", "123liangyudong", 25));
        return users;
    }

    @Override
    public Map<String, Object> query(List<Integer> empCodes) {
        Map<String, Object> empInfo1 = new HashMap<>(10);
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
        Map<String, Object> map = new HashMap<>(10);
        map.put("list", list);
        return map;
    }
}
