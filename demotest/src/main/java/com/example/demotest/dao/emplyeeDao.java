package com.example.demotest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demotest.entity.Employee;

public interface emplyeeDao{
public Employee addEmploee(Employee employee );
	
	public Employee getByID( int id);
	
	public boolean updatebyID(Employee employee);
	
	public boolean deleteById(int id);
	
	public List<Employee> getAllEmployee();


}
