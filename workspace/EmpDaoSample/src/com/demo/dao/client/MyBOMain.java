package com.demo.dao.client;

import com.demo.dao.EmpBOService;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoMapImpl;

public class MyBOMain {

	public static void main(String[] args) {
		
		EmpDao dao=new EmpDaoMapImpl();
		
		EmpBOService service=new EmpBOService(dao);
		
		service.searchEmp(102);
		
	}

}
