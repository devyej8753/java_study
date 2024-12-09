package com.gn.practice01.run;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		
		Student s = new Student();
		arr[0]  = s;
		
		Employee e = new Employee();
		arr[1] = e;
		for(Person p : arr) {
			p.introduce();
		}
		
		
	}

}
