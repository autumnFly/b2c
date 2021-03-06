package com.csair.b2c.cloud.test.pattern.insure.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.csair.b2c.cloud.test.pattern.insure.model.InsureBaseDO;
import com.csair.b2c.cloud.test.pattern.insure.model.SunshineDO;
import com.csair.b2c.cloud.test.pattern.insure.serviceable.InsureableService;
import com.csair.b2c.cloud.test.pattern.insure.serviceable.SunshineInsureableService;

@Service
public class SunshineInsureServiceImpl extends InsureServiceBase {
	@Autowired
	ApplicationContext context;
	@Autowired
	private SunshineDO sunshineDO;

	@Override
	protected InsureableService fetchProperInsureable(String type) {

		Collection<SunshineInsureableService> collection = context.getBeansOfType(SunshineInsureableService.class)
				.values();

		for (SunshineInsureableService pinganInsureableService : collection) {
			if (pinganInsureableService.shouldHandler(type)) {
				return pinganInsureableService;
			}
		}
		throw new RuntimeException("wrong type:" + type);
	}

	@Override
	public InsureBaseDO getInsureBase() {
		return sunshineDO;
	}

}
