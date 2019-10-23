package com.csair.b2c.test.mybatis.service.helper;

import com.csair.b2c.test.mybatis.entity.Actor;
import com.csair.b2c.test.mybatis.mapper.mysql.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 2019/4/26.
 *
 * @author yudong
 */
@Component
public class TransactionHelper {

    @Autowired
    private TestMapper testMapper;

    @Transactional(rollbackFor = Exception.class)
    public int handler() {
        Actor actor = new Actor();
        actor.setFirstName("liang");
        actor.setLastName("yudong");
        int res = testMapper.insertActor(actor);
        // int a = 1;
        // if (a == 1) {
        //     throw new RuntimeException();
        // }
        return res;
    }
}
