package com.csair.b2c.cloud.test.mybatistk.mapper;

import com.csair.b2c.cloud.test.mybatistk.model.Actor;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created on 2018/10/18.<br/>
 *
 * @author yudong
 */
public interface ActorMapper extends Mapper<Actor> {
    List<Actor> findAll();

}
