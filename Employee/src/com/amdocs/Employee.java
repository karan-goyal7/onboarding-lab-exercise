package com.amdocs;

public class Employee {
	
	private String name;
	private String designation;
	private String department;
	
	private Address data = new Address();


	public Employee() {
		
	}
	
	public Employee(String name, String designation, String department, Address data) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.data = data;
	}




	public String getName() {
		return name;
	}
	

}
