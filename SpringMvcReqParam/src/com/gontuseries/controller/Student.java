package com.gontuseries.controller;

//http://localhost:8080/SpringMVC/admissionForm.html
import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	//@Size(min=2, max=30, message="Please enter hobby in bewtween {min} and {max}")

	
	@Size(min=2, max=30) 
	@IsValidHobby(message="dsndbsh", ListOfValidators="vcsgdvc|sdfs|Sdfs")
	private String studentHobby;
	@Max(2222)
	private Long studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
}
