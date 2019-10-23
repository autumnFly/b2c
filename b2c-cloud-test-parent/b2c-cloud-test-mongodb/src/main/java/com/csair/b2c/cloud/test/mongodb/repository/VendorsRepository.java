package com.csair.b2c.cloud.test.mongodb.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.csair.b2c.cloud.test.mongodb.model.Vendors;
@Repository
public interface VendorsRepository extends MongoRepository<Vendors, Serializable> {
	List<Vendors> findByVendId(String vendId);
}
