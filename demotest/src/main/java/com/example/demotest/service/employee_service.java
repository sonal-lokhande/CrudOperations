package com.example.demotest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demotest.entity.Employee;

public interface employee_service {
	
	public Employee addEmploee(Employee employee );
	
	public Employee getByID( int id);
	
	public boolean updatebyID(Employee employee);
	
	public boolean deleteById(int id);
	
	public List<Employee> getAllEmployee();

}
