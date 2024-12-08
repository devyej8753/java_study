package com.gn.homework09.model.vo;

public class Student {
	private static int num = 0;
	private String name;
	private String agg;
	
	public Student () {
		num++;
	}
	
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Student.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgg() {
		return agg;
	}
	public void setAgg(String agg) {
		this.agg = agg;
	}
	
	

}
