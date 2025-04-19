package com.gontuseries.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GenericExceptionHandlerMethods {

	@ExceptionHandler(value=NullPointerException.class)
	private String NullPointerExceptionHandler(Exception e){
		System.out.println("Null Pointer Exception occured" + e.getMessage());
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=IOException.class)
	private String IOExceptionHandler(Exception e){
		System.out.println("IO Exception occured" + e.getMessage());
		return "IOException";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	private String GeneralExceptionHandler(Exception e){
		System.out.println("Generic Exception occured" + e.getMessage());
		return "Exception";
	}

}
