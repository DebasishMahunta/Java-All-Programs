package com.javabasics;

import com.employee.Employee;

public class Department {
	
	public static final char[] Department = null;
	//Member Variables
	// default visibility
	// public is a access specifier
	public String deptName;
	public int noOfEmployees;
	
	
	  public Department(String dName, int count) { 
		  this.deptName = dName; 
		  this.noOfEmployees = count;
		  }
	 
	//Methods
	
	public int getNumberOfEmployees() {
		return 100;
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getName();
		
		Department d1= new Department("HR",100);
		System.out.println(d1.deptName);
		System.out.println(d1.noOfEmployees);
		
		Department d2= new Department("PWD",200);
		System.out.println(d2.deptName);
		System.out.println(d2.noOfEmployees);
		
	}

}
