package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.phone = "010-1234-5678";
		p1.cm = 190.5;
		p1.kg = 100.2;
		System.out.println("전화번호 : "+p1.phone);
		System.out.println("키 : "+p1.cm+"cm");
		System.out.println("몸무게 : "+p1.kg+"kg");
		
		Person p2 = new Person();
		p2.phone = "010-5643-4563";
		p2.cm = 175.4;
		p2.kg = 65.6;
		System.out.println("전화번호 : "+p2.phone);
		System.out.println("키 : "+p2.cm+"cm");
		System.out.println("몸무게 : "+p2.kg+"kg");
		
		
		
		

	}

}
