package com.csair.b2c.cloud.test.feign.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csair.b2c.cloud.test.feign.model.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {

	Reader findOne(String username);
}
