package com.demo.dao;

public class EmpBOService {

	EmpDao dao;

	public EmpBOService(EmpDao dao) {
		this.dao = dao;
	}

	public void searchEmp(int id) {
		System.out.println(dao.findEmpById(id));
	}
}
