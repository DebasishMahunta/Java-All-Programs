package com.javabasics.inheritance;

public class Chinku extends Student{
	
	private int rn;
	
	public static void main(String[] args) {
		Chinku ch= new Chinku();
		ch.name="Chinku";
		ch.age = "20";
		ch.rn = 2;
		
		System.out.println(ch.giveAttendance());
	}

	@Override
	public boolean giveAttendance() {
		return false;
	}

}
