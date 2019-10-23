package com.csair.b2c.cloud.test.pattern.insure.serviceable;

import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;

public interface InsureableService {
	void doInsureablce(CsAirToubao csAirToubao) throws Exception;

	boolean shouldHandler(String type);
}
