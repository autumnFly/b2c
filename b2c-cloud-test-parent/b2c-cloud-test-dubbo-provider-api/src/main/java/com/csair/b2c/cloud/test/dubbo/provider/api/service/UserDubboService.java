package com.csair.b2c.cloud.test.dubbo.provider.api.service;

import com.csair.b2c.cloud.test.dubbo.provider.api.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
public interface UserDubboService {
    List<User> queryAll();

    Map<String, Object> query(List<Integer> empCodes);
}
