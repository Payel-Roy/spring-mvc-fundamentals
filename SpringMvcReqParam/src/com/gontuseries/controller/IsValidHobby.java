package com.gontuseries.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target(ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String message() default "Please provide a valid hobby in Music, Cricket, Hockey and Football";
	String ListOfValidators() default "Music|Football|Cricket|Hockey"; 
	Class<?> [] groups() default{};
	
	Class<? extends Payload> [] payload() default{};

}
