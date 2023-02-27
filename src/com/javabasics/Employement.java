 package com.javabasics;

public class Employement {
	String Name;
	int id;
	double salary ;
	
	
	
	public void EmployeId() {
		System.out.println("EmployeId");
		
	}
	public double SayYourSalary() {
	     return 25033.60;
	     
	}
	public static void main(String [] args) {
		Department d = new Department("IT",50);
		System.out.println(d.Department);
		Employement e1 = new Employement();
		System.out.println(e1.Name);
		System.out.println(e1.id);
		
		e1.Name = "kiti";
		e1.id = 5236;
		e1.salary = 25033.60;
		System.out.println(e1.Name);
		System.out.println(e1.id);
		System.out.println(e1.salary);
		
		e1.SayYourSalary ();
		double Salary = e1.SayYourSalary();
		System.out.println(Salary);
		
		
	}

}
