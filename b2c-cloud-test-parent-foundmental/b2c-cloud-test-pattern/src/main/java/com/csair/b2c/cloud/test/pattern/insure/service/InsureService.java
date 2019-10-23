package com.csair.b2c.cloud.test.pattern.insure.service;

import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;
import com.csair.b2c.cloud.test.pattern.insure.model.InsureBaseDO;

public interface InsureService {
	void insure(String type, CsAirToubao csAirToubao) throws Exception;

	InsureBaseDO getInsureBase();
}
