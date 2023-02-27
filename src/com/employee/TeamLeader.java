package com.employee;

public class TeamLeader extends Employee {
	private int NoOfpep;
	
	public int getNoOfpep() {
		return NoOfpep;
		
	}
	public void setNoOfpep(int NoOfpep) {
		this.NoOfpep = NoOfpep;
		
	}
	public static void main(String [] args) {
		TeamLeader pinku = new TeamLeader();
		pinku.setName("kiti");
		pinku.setEmpId(100);
		pinku.setNoOfpep(20);
			
			
	}
}
