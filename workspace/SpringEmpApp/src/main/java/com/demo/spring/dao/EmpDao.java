package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.Employee;

public interface EmpDao {

	public String saveEmp(Employee e);

	public List<Employee> getAll();

	public Employee findById(int empid);
	public int saveEmpList(List<Employee> elist);
}
