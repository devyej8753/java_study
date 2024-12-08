package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("김철수");
		s.setAgg("A");
		System.out.println(s.getNum()+" "+s.getName()+" "+s.getAgg());
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAgg("F");
		System.out.println(s1.getNum()+" "+s1.getName()+" "+s1.getAgg());
		
		Student s2 = new Student();
		s2.setName("이영희");
		s2.setAgg("B");
		System.out.println(s2.getNum()+" "+s2.getName()+" "+s2.getAgg());
		
		
		
	}

}
