package com.gontuseries.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String ListOfValidators;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.ListOfValidators = isValidHobby.ListOfValidators();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if(studentHobby == null){
			return false;
		}
		
		if(studentHobby.matches(ListOfValidators)){
			return true;
		}
		else{
		return false;
	}
	}

}
