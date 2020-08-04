package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EmpDataValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp = (Employee) target;
		if (emp.getEmpId() < 100) {
			errors.rejectValue("empId", "idError", "Emp ID Cannot be less than 100");
		}
		if (emp.getName().length() < 4) {
			errors.rejectValue("name", "nameError", "Emp Name Cannot be less than 4 Characters");
		}
		if (emp.getCity().length() < 2) {
			errors.rejectValue("city", "cityError", "City Name Cannot be less than 2 charaters");
		}
		if (emp.getSalary() < 1) {
			errors.rejectValue("salary", "salError", "salary cannot be less than 1");
		}

	}

}
