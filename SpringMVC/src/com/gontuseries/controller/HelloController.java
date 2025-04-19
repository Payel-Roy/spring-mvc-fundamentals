package com.gontuseries.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, 
			HttpServletResponse res) throws Exception {
		ModelAndView mv = new ModelAndView("helloPage");
		mv.addObject("welcomeMessage", "Welcome Payel to Spring World");	
		return mv;
	}


}
