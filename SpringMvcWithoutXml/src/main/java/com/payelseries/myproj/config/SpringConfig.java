package com.payelseries.myproj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.payelseries.myproj")
public class SpringConfig{
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver v = new InternalResourceViewResolver();
		v.setViewClass(JstlView.class); // this helps to create the view -> jsp standard tag library 
		v.setPrefix("/WEB-INF/views/");
		v.setSuffix(".jsp");
		return v;
	}

}
