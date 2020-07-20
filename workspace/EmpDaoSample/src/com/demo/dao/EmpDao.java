package com.demo.dao;

import java.util.List;

import com.demo.dto.Emp;

public interface EmpDao {

	public String save(Emp e);

	public String updateEmp(Emp e);

	public String delete(int id);

	public Emp findEmpById(int id);

	public List<Emp> listAllEmp();
}
