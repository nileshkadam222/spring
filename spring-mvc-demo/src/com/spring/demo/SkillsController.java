package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkillsController {

	@RequestMapping("/showForm")
	public String showUserSkills() {
		return "hello_word_form";
	}
	
}
