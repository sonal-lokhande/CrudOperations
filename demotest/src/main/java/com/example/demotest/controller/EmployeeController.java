package com.example.demotest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demotest.entity.Employee;
import com.example.demotest.service.employee_service;


@RestController("/emploee")
public class EmployeeController {
	
	@Autowired
	employee_service  service;

	@RequestMapping(value = "initilizeList")
	public void inilizeList() {

	}

	@PostMapping(value = "/saveEmployee")
	public Employee saveEmployee(Employee employee) {
		Employee emploee = service.addEmploee(employee);
		System.out.println(employee);
		return employee;
	}
	
	@GetMapping(value = "/getEmployeebyId/{id}")
	public Employee getById(@PathVariable int id ) {
	 Employee byID = service.getByID(id);
	 return byID;
	}
	
	
	@PutMapping(value = "updateEmployee")
	public boolean updateEmployee(@RequestBody Employee employee) {
		boolean updatebyID = service.updatebyID(employee);
		return updatebyID;
	}
	
	@DeleteMapping(value = "deletdEmployee/{id}")
	public boolean deleteEMployee(@PathVariable int id) {
		boolean deleteById = service.deleteById(id);
		return deleteById;
	}
	

	

}
