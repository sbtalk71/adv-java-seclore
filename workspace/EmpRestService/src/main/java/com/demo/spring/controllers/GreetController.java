package com.demo.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	//GET : http://localhost:8080/EmpRESTApp/greet
	@RequestMapping(path = "/greet/{n}", method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> greet(@PathVariable("n") String name) {
		return ResponseEntity.ok(name+", Welcome to REST");
	}
}
