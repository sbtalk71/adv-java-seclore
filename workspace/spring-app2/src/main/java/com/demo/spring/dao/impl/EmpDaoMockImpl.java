package com.demo.spring.dao.impl;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;


public class EmpDaoMockImpl implements EmpDao {

	@Override
	public String saveEmp(Employee e) {

		return "Mock : Employee with id " + e.getEmpId() + " is saved";
	}

}
