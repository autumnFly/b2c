package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.Country;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * <ul>
 * <li>#root.args,缓存方法参数,为一个数组</li>
 * <li>#root.caches,缓存方法所对应的缓存,为一个数组</li>
 * <li>#root.target,目标对象</li>
 * <li>#root.targetClass,目标对象的类,是#root.target.class的简写</li>
 * <li>#root.method,缓存方法</li>
 * <li>#root.methodName,缓存方法名称,是#root.method.name的简写</li>
 * <li>#root.result,方法调用的返回值</li>
 * <li>#argument,方法的参数名</li>
 * </ul>
 * TODO 有些问题未解决
 *
 * @author yudong
 */
public interface CountryMapper {

    String PREFIX = "mybatis:mapper:country:";

    @CacheEvict(PREFIX)
    int deleteByPrimaryKey(Short countryId);

    @CachePut(value = PREFIX, key = "#result.countryId")
    int insert(Country record);

    @Cacheable(value = PREFIX)
    Country selectByPrimaryKey(Short countryId);

    List<Country> selectAll();

    // @CacheEvict(value = PREFIX, key = "#root.args[0].countryId")

    @CacheEvict(value = PREFIX, key = "#record.countryId")
    int updateByPrimaryKey(Country record);
}