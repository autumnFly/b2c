package com.csair.b2c.cloud.test.rpc.service;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.model.po.Book;
import com.csair.b2c.cloud.test.model.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Book getBook(Long id) {
        logger.info("req id:{}", id);
        Book book = new Book();
        book.setId(id);
        book.setAuthor("yudong");
        logger.info("res:{}", JSONObject.toJSONString(book));
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        Book book = new Book();
        book.setId(10001L);
        book.setAuthor("yudong");
        Book book1 = new Book();
        book1.setId(10002L);
        book1.setAuthor("lydong6");
        list.add(book);
        list.add(book1);
        logger.info("res:{}", JSONObject.toJSONString(list));
        return list;
    }

}
