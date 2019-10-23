package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.entity.Actor;
import com.csair.b2c.test.mybatis.model.SelectActorReqEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Map<String, String>> selectActors(@Param("actorIds") List<String> actorIds);

    List<Map<String, String>> selectActor(@Param("entity") SelectActorReqEntity entity, @Param("firstName") String firstName);

    int insertActor(Actor actor);
}
