package com.gn.practice01.model.vo;

public class Manager extends Employee {
	private String departtment;
	
	public Manager() {}
	
	public Manager(String name, String department) {
		super(name);
		this.departtment = department;
	}
	public void printDeaprtment() {
		super.printlnfo();
		System.out.println("담당 부서 : "+ departtment);
	}
}
