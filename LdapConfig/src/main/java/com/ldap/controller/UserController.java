package com.ldap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginb");
		return mav;
	}

	@PostMapping(value = "/signup")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		return mav;
	}

	@GetMapping(value = "/profile")
	public ModelAndView profile() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("profile.");
		return mav;
	}

}
