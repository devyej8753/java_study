package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] persons = str.split("\n");
		Person[] personArr = new Person[3];
		int i = 0;
		for(String person : persons) {
			String[] p1 = person.split(",");
			personArr[i] = new Person(p1[0] ,Integer.parseInt(p1[1])
					,p1[2],p1[3].charAt(0)); 
			i++;
		}
		for(Person p : personArr) {
			System.out.println(p);
		}
		
		
		
	}

}
