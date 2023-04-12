package com.group8.services.cloudgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins="http://localhost:3000")
@Controller
public class LoginController {
	@RequestMapping("/welcome")//, method=RequestMethod.POST)
	public String showWelcome(ModelMap model) {
		return "login";
	}
}
