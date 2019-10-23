package com.csair.b2c.cloud.test.pattern.insure.serviceable.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;
import com.csair.b2c.cloud.test.pattern.insure.model.SunshineDO;
import com.csair.b2c.cloud.test.pattern.insure.serviceable.SunshineInsureableService;

@Service
public class SunshineCombinationInsureableServiceImpl implements SunshineInsureableService {
	@Autowired
	private SunshineDO sunshineDO;

	@Override
	public void doInsureablce(CsAirToubao csAirToubao) throws Exception {
		System.out.println("阳光组合险投保成功");
	}

	@Override
	public boolean shouldHandler(String type) {
		if (sunshineDO.getCombinationMap().get(type) != null) {
			return true;
		} else {
			return false;
		}
	}
}
