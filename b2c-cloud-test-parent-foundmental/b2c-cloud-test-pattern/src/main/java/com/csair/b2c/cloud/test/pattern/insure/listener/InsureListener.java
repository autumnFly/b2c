package com.csair.b2c.cloud.test.pattern.insure.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csair.b2c.cloud.test.pattern.insure.factory.InsureSimpleFactory;
import com.csair.b2c.cloud.test.pattern.insure.model.CsAirToubao;
import com.csair.b2c.cloud.test.pattern.insure.service.InsureService;

@Component
public class InsureListener {

	@Autowired
	private InsureSimpleFactory factory;

	public int comsomeMessage(String type, String orderNo) {
		try {
			System.out.println(type + " " + orderNo);
			CsAirToubao csAirToubao = new CsAirToubao(type, orderNo);

			InsureService service = factory.getInsureService(type);
			service.insure(type, csAirToubao);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return 1;
	}
}
