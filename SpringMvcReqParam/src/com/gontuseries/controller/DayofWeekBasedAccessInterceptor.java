package com.gontuseries.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayofWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws IOException{
		
		Calendar c =  Calendar.getInstance();
		int dayOfWeek = c.get(c.DAY_OF_WEEK);
		if(dayOfWeek == 1){
			res.getWriter().write("The website is closed on Sun, Please do visit our website on any other day");
			return false;
		}
		return true;		
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("This will execute after request handler method is done in controller" + request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("This will execute after response with proper view is rendered and returned to client" + request.getRequestURI().toString());
	}
}
