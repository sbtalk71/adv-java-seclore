package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Service
@Scope("prototype")
public class EmpRegisterApp {
	@Autowired
	@Qualifier("empDaoMockImpl")
	private EmpDao dao;



	public String registerEmp(int id, String name, String city, double salary) {
		String resp = dao.saveEmp(new Employee(id, name, city, salary));
		System.out.println(resp);
		return "Emp Registered";

	}
}
