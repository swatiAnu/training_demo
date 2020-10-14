package com.examples.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SillyController
{
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		
		//manipulate data
		theName= theName.toUpperCase();
		
		//create the message
		 String result = "Hello and Welcome  "+theName;
		 
		 //add message to model
		 
		 model.addAttribute("message",result);
		
		return "silly";
	}

}
