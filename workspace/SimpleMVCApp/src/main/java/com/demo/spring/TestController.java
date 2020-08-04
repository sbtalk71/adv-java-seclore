package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(path = "/greet", method = RequestMethod.GET)
	public String greetWithPage() {
		System.out.println("from Inside MVC Controller...");
		return "hello";
	}
}
