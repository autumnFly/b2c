package com.csair.b2c.cloud.test.cache.controller;

import com.csair.b2c.cloud.test.cache.model.Book;
import com.csair.b2c.cloud.test.common.constant.CacheConst;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Cacheable(CacheConst.REDIS_PREFIX_CACHE)
    @RequestMapping(value = "cacheable", method = {RequestMethod.GET})
    public Book cacheable(Long id) {
        System.out.println(id);
        // 模拟从数据库查出的book
        Book book = new Book();
        book.setId(id);
        book.setAuthor("liang yudong");
        book.setTitle("Java Master");
        return book;
    }

    @CachePut(value = CacheConst.REDIS_PREFIX_CACHE, key = "#result.id")
    @RequestMapping(value = "cachePut", method = {RequestMethod.GET})
    public Book cachePut(Book book) {
        // 模拟数据库生成的id
        book.setId(RandomUtils.nextLong());
        return book;
    }

}
