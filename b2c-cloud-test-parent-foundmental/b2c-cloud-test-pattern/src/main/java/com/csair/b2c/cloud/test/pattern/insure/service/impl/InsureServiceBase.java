package com.csair.b2c.cloud.test.pattern.insure.service.impl;

import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;
import com.csair.b2c.cloud.test.pattern.insure.service.InsureService;
import com.csair.b2c.cloud.test.pattern.insure.serviceable.InsureableService;

/**
 * 工厂方法模式
 * 
 * @author yudong
 *
 */
public abstract class InsureServiceBase implements InsureService {

	@Override
	public void insure(String type, CsAirToubao csAirToubao) throws Exception {
		InsureableService insureableService = fetchProperInsureable(type);
		insureableService.doInsureablce(csAirToubao);

	}

	protected abstract InsureableService fetchProperInsureable(String type);

}
