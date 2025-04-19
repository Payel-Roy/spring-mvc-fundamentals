package com.payelseries.myproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HomeController {


		@RequestMapping("/welcome.html")
		protected ModelAndView helloWorld() throws Exception {
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("welcomeMessage", "Welcome Payel to Spring World");	
			return mv;
		}
	
//		@RequestMapping("/hi")
//		protected ModelAndView hiWorld() throws Exception {
//			ModelAndView mv = new ModelAndView("home");
//			mv.addObject("welcomeMessage", "Hi Payel to Spring World");	
//			return mv;
//		}
}
