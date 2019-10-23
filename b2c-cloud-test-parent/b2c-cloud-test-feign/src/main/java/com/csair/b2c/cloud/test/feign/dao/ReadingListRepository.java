package com.csair.b2c.cloud.test.feign.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csair.b2c.cloud.test.feign.model.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}