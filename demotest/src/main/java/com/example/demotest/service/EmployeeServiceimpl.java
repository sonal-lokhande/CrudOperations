package com.example.demotest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demotest.dao.emplyeeDao;
import com.example.demotest.dao.emplyeeDaoIMPL;
import com.example.demotest.entity.Employee;
@Service
public class EmployeeServiceimpl implements employee_service {
	
	@Autowired
	emplyeeDao daoIMPL;

	@Override
	public Employee addEmploee(Employee employee) {
		// TODO Auto-generated method stub
		return  daoIMPL.addEmploee(employee);
	}

	@Override
	public Employee getByID(int id) {
		// TODO Auto-generated method stub
		return daoIMPL.getByID(id);
	}

	@Override
	public boolean updatebyID(Employee employee) {
		// TODO Auto-generated method stub
		return daoIMPL.updatebyID(employee);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return daoIMPL.deleteById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return daoIMPL.getAllEmployee();
	}

}
