package com.example.demotest.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demotest.entity.Employee;

@Repository
public class emplyeeDaoIMPL implements emplyeeDao {
	
	List<Employee> list = new ArrayList<Employee>();
	public emplyeeDaoIMPL() {
		list.add(new Employee(15, "sonal", 1554484, "finance", 51576.60));
		list.add(new Employee(11,"sakshi", 4564138, "hr", 14582.2));
		list.add(new Employee(14,"akash",1583518, "hr", 86957.25));
        list.add(new Employee(52, "amit", 4596875, "markating", 89657.2));
	
	}
	
	
	@Autowired
	private SessionFactory factory;

	@Override
	public Employee addEmploee(Employee employee) {
		
		Session openSession = factory.openSession();
		try {
			Object save = openSession.save(employee);
			
		} catch (Exception e) {
			System.out.println("invalid data");
		}
		Object save = openSession.save(employee);
		return (Employee) save;
	}

	@Override
	public Employee getByID(int id) {
		
		Session openSession = factory.openSession();
		Employee employee=null;
		try {
			 employee = openSession.get(Employee.class, id);
		} catch (Exception e) {
e.printStackTrace();		}
		
		return employee;
	}

	@Override
	public boolean updatebyID(Employee employee) {
       
		Session openSession = factory.openSession();
		boolean isUpdated= false;
		
		
		try {
			  openSession.update(employee);
			 openSession.beginTransaction().commit();
			 isUpdated = true;
			
		} catch (Exception e) {
       System.out.println("update not done");
		isUpdated = false;
		}
		return isUpdated;
	}

	@Override
	public boolean deleteById(int id) {
		Session openSession = factory.openSession();
	    boolean isDeleted = false;
		try {
			Employee employee = openSession.get(Employee.class, id);
			openSession.delete(employee);
			isDeleted = true;
		} catch (Exception e) {
System.out.println("employee not found");
isDeleted = false;
		
		}
		return isDeleted;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = null;
		List<Employee> list = null;
		try {
			session = factory.openSession();
list = session.createQuery("select * from Employee ", Employee.class).getResultList();
                                   
/*
			 * criteria.setFirstResult(2); System.out.println(criteria);
			 * criteria.setMaxResults(3); System.out.println(criteria);
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;

	}
}
