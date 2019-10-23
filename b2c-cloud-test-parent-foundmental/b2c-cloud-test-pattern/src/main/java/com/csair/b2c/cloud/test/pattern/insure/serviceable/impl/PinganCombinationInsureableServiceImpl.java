package com.csair.b2c.cloud.test.pattern.insure.serviceable.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;
import com.csair.b2c.cloud.test.pattern.insure.model.PinganDO;
import com.csair.b2c.cloud.test.pattern.insure.serviceable.PinganInsureableService;

@Service
public class PinganCombinationInsureableServiceImpl implements PinganInsureableService {

	@Autowired
	private PinganDO pinganDO;

	@Override
	public void doInsureablce(CsAirToubao csAirToubao) throws Exception {
		System.out.println("平安组合险投保成功");
	}

	@Override
	public boolean shouldHandler(String type) {
		if (pinganDO.getCombinationMap().get(type) != null) {
			return true;
		} else {
			return false;
		}
	}

}
