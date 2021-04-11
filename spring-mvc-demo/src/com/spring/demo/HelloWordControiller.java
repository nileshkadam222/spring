package com.spring.demo;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWordControiller {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello_word_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
	  return "helloword";	
	}
	
	@RequestMapping("/processFromVersion2")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo ! "+theName;
		model.addAttribute("message",result);
		return "helloword";
	}
	
	
	@RequestMapping("/processFromVersion3")
	public String letsShoutDude1(@RequestParam("studentName") String theName ,Model model) {
		theName = theName.toUpperCase();
		String result = "Yo ! "+theName;
		model.addAttribute("message",result);
		return "helloword";
	}
}
