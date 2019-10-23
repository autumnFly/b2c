package com.csair.b2c.cloud.test.actuator.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.trace.Trace;
import org.springframework.boot.actuate.trace.TraceRepository;
import org.springframework.stereotype.Service;

/**
 * trace跟踪条目存储在其他地方——既不消耗内存，又能长久保存,只需实现Spring Boot的TraceRepository接口即可
 * 
 * @author yudong
 * 
 */
@Service
public class MongoTraceRepository implements TraceRepository {

	@Override
	public List<Trace> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Map<String, Object> traceInfo) {
		// TODO Auto-generated method stub
		
	}

}
