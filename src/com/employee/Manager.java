package com.employee;

// Super Class : Employee
// Sub class : Manager
// Parent class: Employee
// Child class : Manager

public class Manager extends Employee{
	
	
	private int noOfEmpRep;
	
	public int getNoOfEmpRep() {
		return noOfEmpRep;
	}

	public void setNoOfEmpRep(int noOfEmpRep) {
		this.noOfEmpRep = noOfEmpRep;
	}



	public static void main(String[] args) {
		Manager pinku = new Manager();
		pinku.empId= 100;
		pinku.name="pinku";
		pinku.noOfEmpRep=10;
		System.out.println(100);
		System.out.println("pinku");
		System.out.println(10);
		
		
		
	}

}
