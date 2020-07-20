package com.demo.mvc;

public class EmpController {

	private Emp emp;
	private EmpView empView;

	public EmpController(Emp emp, EmpView empView) {
		this.emp = emp;
		this.empView = empView;
	}

	public void updateModel(Emp e) {
		this.emp = e;
	}

	public void updateView() {
		empView.updateEmp(emp);
		empView.printEmpDetails();

	}
}
