package com.gn.practice08.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.gn.practice07.model.vo.Equipment;
import com.gn.practice08.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Set<Person> set1 = new HashSet<Person>();
		set1.add(new Person("홍길동",20));
		set1.add(new Person("이순신",25));
		set1.add(new Person("유관순",22));
		
		Set<Person> set2 = new HashSet<Person>();
		set2.add(new Person("유관순",22));
		set2.add(new Person("강감찬",27));
		set2.add(new Person("을지문덕",30));
		
		Set<Person> set3 = new TreeSet<Person>();
		set3.addAll(set1);
		set3.addAll(set2);
		
		System.out.println("=== 합집합 ===");
		int number = 1;
		Iterator<Person> iterator = set3.iterator();
		while(iterator.hasNext()) {
			Person str1 = iterator.next();
			System.out.println(number+"번 "+str1);
			number++;
		
		}
		int num = 1;
		System.out.println("=== 교집합 ===");
		set3 = new TreeSet<Person>(set1);
		set3.retainAll(set2);
		Iterator<Person> iterator1 = set3.iterator();
		while(iterator1.hasNext()) {
			Person intersection1 = iterator1.next();
			System.out.println(num+"번 "+intersection1);
			num++;
		}
		int nums = 1;
		System.out.println("=== 차집합 ===");
		set3 = new TreeSet<Person>(set1);
		set3.removeAll(set2);
		Iterator<Person> iterator2 = set3.iterator();
		while(iterator2.hasNext()) {
			Person differnce1 = iterator2.next();
			System.out.println(nums+"번 "+differnce1);
			nums++;
		}
		
			
		}
		
		
		
		
		
	}


