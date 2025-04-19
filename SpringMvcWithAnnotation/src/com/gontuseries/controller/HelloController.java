package com.gontuseries.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping(value = "/welcome/{countryName}/{userName}", method= RequestMethod.GET)
	protected ModelAndView helloWorld(@PathVariable("userName") String name, @PathVariable("countryName") String country) throws Exception {
		ModelAndView mv = new ModelAndView("helloPage");
		mv.addObject("welcomeMessage", "Hello "+name + " from " + country);	
		return mv;
	}

	@RequestMapping("/hi/{countryName}/{userName}")
	protected ModelAndView hiWorld(@PathVariable Map<String, String> pathvars) throws Exception {
		String name = pathvars.get("userName");
		String country = pathvars.get("countryName");
		ModelAndView mv = new ModelAndView("helloPage");
		//mv.addObject("welcomeMessage", "Hii Payel");
		mv.addObject("welcomeMessage", "Hi "+name + " from " + country);	
		return mv;
	}
}
