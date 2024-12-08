package com.gn.homework08.controller;

import com.gn.homework08.open.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "김철수";
		p.age = 20;
		
		System.out.println(p.name+"는 "+p.age+"살 입니다." );
		
		Person s = new Person();
		s.setName("김철수");
		s.setAge(20);
		System.out.println(s.getName()+"는 "+s.getAge()+"살 입니다.");
		
		
	}
		

}
