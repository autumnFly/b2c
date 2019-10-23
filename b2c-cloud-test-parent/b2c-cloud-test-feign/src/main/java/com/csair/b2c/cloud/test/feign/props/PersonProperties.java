package com.csair.b2c.cloud.test.feign.props;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.csair.b2c.cloud.test.feign.model.Person;

@Component
@ConfigurationProperties("foo")
public class PersonProperties {
	private final List<Person> list = new ArrayList<>();

	public List<Person> getList() {
		return this.list;
	}
}
