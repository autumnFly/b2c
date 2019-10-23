package com.csair.b2c.cloud.test.feign.controller;

import com.csair.b2c.cloud.test.feign.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class VersionController {

	@Autowired
	private VersionService versionService;

	@RequestMapping(value = "config", method = { RequestMethod.GET })
	public String configVersion() {
		return versionService.configVersion();
	}
}
