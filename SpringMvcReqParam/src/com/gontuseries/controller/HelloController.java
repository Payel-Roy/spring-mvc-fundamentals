package com.gontuseries.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields("studentMobile"); //works as well
//		binder.setDisallowedFields(new String [] {"studentMobile"});
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(sdf, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentEditor());
	}

	//@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	@GetMapping(value="/admissionForm.html")
	protected ModelAndView helloWorld() throws Exception {
		
		String Exception_Occured = "NULLPOINTER_EXCEPTION";
//
//		if(Exception_Occured.equals("IO_EXCEPTION")){
//			throw new IOException("IO_EXCEPTION");
//		}else
//		if(Exception_Occured.equals("NULLPOINTER_EXCEPTION")){
//			throw new NullPointerException("NULL POINTER EXCEPTION");
//		}
		//else
//			if(Exception_Occured.equals("GENERAL_EXCEPTION")){
//				throw new Exception("GENERAL EXCEPTION");
//			}
		
		ModelAndView mv = new ModelAndView("AdmissionForm");
		mv.addObject("welcomeMessage", "Gontu College of engineering");
		return mv;
	}

	//@RequestMapping(value= "/SubmissionForm.html", method=RequestMethod.POST)
	@PostMapping(value="/SubmissionForm1.html")
	protected ModelAndView hiiWorld(@RequestParam(value="studentName", defaultValue= "Mr Gontu") String name, @RequestParam(value="studentHobby") String hobby) throws Exception {			
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		mv.addObject("welcomeMessage", name + " have submitted form who has having a hobby as " + hobby);
		return mv;
	}

	//@RequestMapping(value= "/SubmissionForm.html", method=RequestMethod.POST)
	@PostMapping(value="/SubmissionForm2.html")
	protected ModelAndView hiWorld(@RequestParam Map<String, String> Student) throws Exception {	
		
		String name = Student.get("studentName");
		String hobby= Student.get("studentHobby");
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		mv.addObject("welcomeMessage", name + " have submitted form who has having a hobby as " + hobby);
		return mv;
	}

	
	//@RequestMapping(value= "/SubmissionForm.html", method=RequestMethod.POST)
	@PostMapping(value="/SubmissionForm3.html")
	protected ModelAndView hiiiWorld(@RequestParam(value="studentName", defaultValue= "Mr Gontu") String name, @RequestParam(value="studentHobby") String hobby) throws Exception {	
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);

		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		//mv.addObject("welcomeMessage", "Gontu College of engineering");
		mv.addObject("student1",student);
		return mv;
	}


	//@RequestMapping(value= "/SubmissionForm.html", method=RequestMethod.POST)
	@PostMapping(value="/SubmissionForm4.html")
	protected ModelAndView hiWorld(@ModelAttribute(value= "student1") Student abc) throws Exception {	
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		//mv.addObject("welcomeMessage", "Gontu College of engineering");
		return mv;
	}
	
	@PostMapping(value="/SubmissionForm.html")
	protected ModelAndView hiiiWorld(@Valid @ModelAttribute(value= "student1") Student student1, BindingResult result) throws Exception {	
		if(result.hasErrors()){
			ModelAndView mv1 = new ModelAndView("AdmissionForm");			//mv.addObject("welcomeMessage", "Gontu College of engineering");
			return mv1;
			
		}
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		//mv.addObject("welcomeMessage", "Gontu College of engineering");
		return mv;
	}
	
	@ModelAttribute
	protected void addCommonObject(Model model){
		model.addAttribute("welcomeMessage", "Gontu College of engineering");
	}
}
