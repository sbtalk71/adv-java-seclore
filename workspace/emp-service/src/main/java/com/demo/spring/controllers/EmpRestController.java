package com.demo.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@RestController
@RequestMapping("/emp")
public class EmpRestController {

	@Autowired
	private EmpDao dao;

	// @RequestMapping(path = "/find/{id}", method = RequestMethod.GET, produces =
	// MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(path = "/find/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity findOneEmp(@PathVariable("id") int empId) {
		Employee emp = dao.findById(empId);
		if (emp != null) {
			return ResponseEntity.ok(emp);
		} else {
			return ResponseEntity.ok("{\"Status\":\"Emp Not Found..\"}");
		}
	}

	@RequestMapping(path = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> enrollEmp(@RequestBody Employee e) {

		String resp = dao.saveEmp(e);
		return ResponseEntity.ok(resp);

	}

	@DeleteMapping(path = "/delete", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> removeEmp(@RequestParam(name = "id",required = true) int id) {
		String responce = dao.delete(id);
		return ResponseEntity.ok(responce);
	}
	
	@GetMapping(path = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Employee>> listAll(){
		return ResponseEntity.ok(dao.getAll());
	}
}







