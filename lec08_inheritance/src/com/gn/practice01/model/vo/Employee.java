package com.gn.practice01.model.vo;

public class Employee {
	protected String name;
	
	public   Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	public void printlnfo() {
		System.out.println("직원이름 : "+name);
		
	}
}
