package com.csair.b2c.cloud.test.mail.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import com.csair.b2c.cloud.test.mail.entity.Product;

@Service
public class ProductService {
	public List<Product> findAll() {
		List<Product> products = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			products.add(getRandomPro());

		}
		return products;
	}

	public Product findById(Integer id) {
		Product product = getRandomPro();
		product.setId(id);
		return product;
	}

	private Product getRandomPro() {
		Product product = new Product();
		product.setId(RandomUtils.nextInt());
		product.setInStock(RandomUtils.nextBoolean());
		product.setName("PDT" + RandomStringUtils.randomAlphabetic(3));
		product.setPrice(new BigDecimal(RandomStringUtils.randomNumeric(5)));
		return product;
	}
}
