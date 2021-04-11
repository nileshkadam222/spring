package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// Create a new Studen Object
		Student theStudent = new Student();

		// add student object in the model
		theModel.addAttribute("student", theStudent);

		return "studen-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudnet : "+theStudent.getFirstName() + "  "+theStudent.getLastName() + "  "+theStudent.getCountry());
		return "student-confirmation";
	}
}
