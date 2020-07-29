package com.demo.spring.controllers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.demo.spring.Employee;

@Controller
public class EmpController {

	private JdbcTemplate jdbcTemplate;
	
	public String addEmp(Employee e) {
		
	}
}
