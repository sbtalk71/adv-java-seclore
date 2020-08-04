package com.demo.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class GlobalExceptionhandler{

@ExceptionHandler(RuntimeException.class)
	public String handleMyException(RuntimeException ex) {
		System.out.println("Global  Scoped Exception Handler");
		return "failed";
	}


}
