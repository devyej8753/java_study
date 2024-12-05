package com.gn.practice07.model.vo;

public class Supplement {
	private String name;
	private int dosage;
	private int age;
	
	public Supplement() {}
	
	public Supplement(String name, int dosage, int age) {
		this.name = name;
		this.dosage = dosage;
		this.age = age;
	}
//	public String getName() {
//		return name;
//	}
//	public int getDosage() {
//		return dosage;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setDosage(String dosage) {
//		this.dosage = dosage;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
	public void information() {
		System.out.println("이름: "+name+" 복용량: "+dosage+"알 "+"가격: "+age+"원");
	}
	
}
