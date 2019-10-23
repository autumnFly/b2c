package com.csair.b2c.cloud.test.actuator.configs;

import org.springframework.boot.actuate.trace.InMemoryTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ActuatorConfigs {
	/**
	 * 该bean可以将/trace容量调整至1000个条目
	 */
	@Bean
	@Primary
	public InMemoryTraceRepository traceRepository() {
		InMemoryTraceRepository traceRepo = new InMemoryTraceRepository();
		traceRepo.setCapacity(1000);
		return traceRepo;
	}
}
