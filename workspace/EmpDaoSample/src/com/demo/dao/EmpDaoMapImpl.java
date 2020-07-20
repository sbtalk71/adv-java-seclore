package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.demo.dto.Emp;

public class EmpDaoMapImpl implements EmpDao {

	static HashMap<Integer, Emp> empDb = new HashMap<>();
	static {
		empDb.put(100, new Emp(100, "Shantanu", "Hyderabad", 45000));
		empDb.put(102, new Emp(102, "Arun", "Bangalore", 55000));
		empDb.put(103, new Emp(103, "Raja", "Chennai", 88000));
		empDb.put(104, new Emp(104, "John", "Hyderabad", 65000));
		empDb.put(105, new Emp(105, "Amit", "Gurgaon", 75000));
	}

	@Override
	public String save(Emp e) {
		String response = "";
		if (empDb.containsKey(e.getEmpId())) {
			response = "Emp already exists";
		} else {
			empDb.put(e.getEmpId(), e);
			response = "Emp Saved";
		}
		return response;
	}

	@Override
	public String updateEmp(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findEmpById(int id) {
		if(empDb.containsKey(id)) {
			return empDb.get(id);
		}else {
		throw new RuntimeException("Emp Not found with id "+id);
		}
	}

	@Override
	public List<Emp> listAllEmp() {
		
		return new ArrayList<>(empDb.values());
	}

}
