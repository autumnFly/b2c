package com.csair.b2c.cloud.test.websocket.controller;

import java.util.List;

import com.csair.b2c.cloud.test.websocket.model.Car;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.websocket.validation.OrederedChecksGroup;

@RestController
public class ValidationController {
	@RequestMapping(value = "/carInfo", method = { RequestMethod.POST })
	public String carInfo(@RequestBody @Validated({ OrederedChecksGroup.class }) Car car, BindingResult bindingResult) {
		System.out.println(JSONObject.toJSONString(car));
		List<ObjectError> errors = bindingResult.getAllErrors();
		for (ObjectError objectError : errors) {
			System.out.println(objectError.toString());
		}
		return "1";
	}

}
