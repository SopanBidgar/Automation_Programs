package com.practice.demo;

public class EncapsulationExample {
	
	private int age;
	private int salary;
	private String name;
	
	
	public int getage() {
		return age;
	}
	
	public void setage(int newage) {
		 age=newage;
	}
	
	public int getsalary() {
		return salary;
	}

	public void setsalary(int newsalary) {
		salary= newsalary;
	}
	public String getname() {
		return name;
	}
	public void setname(String newname) {
		name= newname;
	}
	
	public static void main(String[] args) {
		
		EncapsulationExample d=new EncapsulationExample();
		d.setage(12);
		d.setsalary(12000);
		d.setname("Sopan");
		System.out.println(d.getage());
		System.out.println(d.getsalary());
		System.out.println(d.getname());

	}

}
