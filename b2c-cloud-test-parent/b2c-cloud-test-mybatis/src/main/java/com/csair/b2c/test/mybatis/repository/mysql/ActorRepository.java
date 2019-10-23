package com.csair.b2c.test.mybatis.repository.mysql;

import com.csair.b2c.test.mybatis.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>当Spring Data JPA为接口生成实现的时候,还会查找名字和接口相同,并且添加了impl后缀的一个类,如果
 * 存在这个类,就会将它的方法和生成的方法合并在一起</p>
 * Created by yu on 2018/4/28.
 */
public interface ActorRepository extends JpaRepository<Actor, Integer>, ActorExtReposity {
    Actor findByActorId(Integer id);
}
