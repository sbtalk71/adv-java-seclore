package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "login";
	}

	/*
	 * @RequestMapping(path="/login",method = RequestMethod.POST) public
	 * ModelAndView doLogin(@RequestParam("name") String
	 * userName, @RequestParam("password") String password) { ModelAndView mv = new
	 * ModelAndView(); if (userName.equals(password)) { mv.setViewName("success");
	 * mv.addObject("user", userName); } else { mv.setViewName("failure"); } return
	 * mv; }
	 */

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		if (user.getName().equals(user.getPassword())) {
			mv.setViewName("success");
			mv.addObject("user", user.getName());
		} else {
			mv.setViewName("failure");
		}
		return mv;
	}
}
