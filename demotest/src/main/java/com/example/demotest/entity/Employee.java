package com.example.demotest.entity;

import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Table
public class Employee {
	@PrimaryKeyJoinColumn
	private int employee_ID;
	private String employee_name;
	private long mobile_no;
	private String deprt;
	private double salary;
	public Employee(int employee_ID, String employee_name, long mobile_no, String deprt, double salary) {
		super();
		this.employee_ID = employee_ID;
		this.employee_name = employee_name;
		this.mobile_no = mobile_no;
		this.deprt = deprt;
		this.salary = salary;
	}
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getDeprt() {
		return deprt;
	}
	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employee_ID=" + employee_ID + ", employee_name=" + employee_name + ", mobile_no=" + mobile_no
				+ ", deprt=" + deprt + ", salary=" + salary + "]";
	}
	
	
	

}
