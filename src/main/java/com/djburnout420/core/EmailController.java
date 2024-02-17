package com.djburnout420.core;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmailController {
	
	@GetMapping("/")
	public String displayHomepage(Model model) {
		model.addAttribute("email", new Email());
		return "index";
	}
	
	@PostMapping("/sendemail")
	public ModelAndView submitForm(@ModelAttribute Email email, Model model, HttpServletRequest request) {
		model.addAttribute("email", email);
		System.out.println("in /sendemail endpoint");
		
		// send email
		
		
		// put into database
		
		
		// TODO: decide how to display to user that email was received successfully
		

		System.out.println("redirecting to / endpoint");
		request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.FOUND);
		return new ModelAndView("redirect:/");
	}
	
}
