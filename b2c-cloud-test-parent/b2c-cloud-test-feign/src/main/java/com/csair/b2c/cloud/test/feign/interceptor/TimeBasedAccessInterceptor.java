package com.csair.b2c.cloud.test.feign.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class TimeBasedAccessInterceptor extends HandlerInterceptorAdapter {

	private int openingTime = 9;
	private int closingTime = 18;

	public void setOpeningTime(int openingTime) {
		this.openingTime = openingTime;
	}

	public void setClosingTime(int closingTime) {
		this.closingTime = closingTime;
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (openingTime <= hour && hour < closingTime) {
			System.out.println("在访问时间段内");
			return true;
		}
		response.sendRedirect("http://host.com/outsideOfficeHours.html");
		return false;
	}
}