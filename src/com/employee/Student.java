package com.employee;

public class Student extends School {
	private int noOfStudents;
	private int StudentRoll;
	
	public int getStudentRoll() {
		return StudentRoll;
	}
	public void setStudentRoll(int StudentRoll) {
		this.StudentRoll = StudentRoll;
	}
	
	public int getNoOfStudents(){
		return noOfStudents;
		
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public static void main(String [] args) {
		Student kiti = new Student();
		kiti.name ="kiti";
		kiti.section = 'A';
		kiti.noOfStudents = 100;
		kiti.StudentRoll = 20;
		System.out.println("kiti");
		System.out.println('A');
		System.out.println(100);
		System.out.println(20);
		
		
				
		
		
	}
	

}
