package com.csair.b2c.cloud.test.model.service;


import com.csair.b2c.cloud.test.model.po.Book;

import java.util.List;

public interface BookService {
	Book getBook(Long id);

	List<Book> getAllBooks();
}
