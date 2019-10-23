package com.csair.b2c.test.mybatis.repository.mysql;

import com.csair.b2c.test.mybatis.entity.Actor;

/**
 * Created on 2019/4/14.<br/>
 *
 * @author yudong
 */
public interface ActorExtReposity {
    void addActor(Actor actor);

    void addActorBack(Actor actor);
}
