package com.examples.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
	@RequestMapping("/showForm")
	public String showNewForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	//need a controller method to read form data
	//add a model
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model)
	{
		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		//manipulate data
		theName= theName.toUpperCase();
		
		//create the message
		 String result = "Hello and Welcome  "+theName;
		 
		 //add message to model
		 
		 model.addAttribute("abc",result);
		
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		
		//manipulate data
		theName= theName.toUpperCase();
		
		//create the message
		 String result = "Hello and Welcome  "+theName;
		 
		 //add message to model
		 
		 model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	
}
