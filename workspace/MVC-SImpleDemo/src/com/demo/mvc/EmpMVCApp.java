package com.demo.mvc;

public class EmpMVCApp {

	public static void main(String[] args) {

		Emp e = new Emp();
		e.setEmpId(100);
		e.setName("Shantanu");
		e.setSalary(45000);

		EmpView view = new EmpView();

		EmpController controller = new EmpController(e, view);

		controller.updateView();

		e.setSalary(56000);

		controller.updateModel(e);
		
		controller.updateView();

	}

}
