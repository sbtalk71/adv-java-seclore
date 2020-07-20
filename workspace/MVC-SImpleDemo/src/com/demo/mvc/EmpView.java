package com.demo.mvc;

public class EmpView {

	private Emp emp;

	public Emp getEmp() {
		return emp;
	}

	public void updateEmp(Emp emp) {
		this.emp = emp;
	}

	public void printEmpDetails() {
		System.out.println("Emp Id : " + emp.getEmpId());
		System.out.println("Name  : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());
	}
}
