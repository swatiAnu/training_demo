package com.examples.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
	
		// create a student object
		Student thestudent= new Student();
		
		//add student obj. to the model
		theModel.addAttribute("student", thestudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println("theStudent: "+ " firstName: "+theStudent.getFirstName()+" lastName: "+theStudent.getLastName());
		System.out.println("getCountryOptions"+theStudent.getCountryOptions());
		System.out.println("getCountry"+theStudent.getCountry());
		System.out.println("getOperatingSystems"+theStudent.getOperatingSystems());
		
		
		
		return "student-confirmation";
	}
}
