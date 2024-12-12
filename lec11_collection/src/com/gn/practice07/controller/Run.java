package com.gn.practice07.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gn.practice07.model.vo.Equipment;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓",15000));
		storage1.add(new Equipment("배트",6000));
		storage1.add(new Equipment("축구공",3000));
		
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트",6000));
		storage2.add(new Equipment("야구공",5000));
		storage2.add(new Equipment("글러브",9000));
		
		Set<Equipment> union = new HashSet<Equipment>(storage1);
		union.addAll(storage2);
		System.out.println("=== 합집합 ===");
		Iterator<Equipment> iterator = union.iterator();
		while(iterator.hasNext()) {
			Equipment str = iterator.next();
			System.out.println(str);
			}
		
		System.out.println("=== 교집합 ===");
		Set<Equipment> intersection = new HashSet<Equipment>(storage1);
		intersection.retainAll(storage2);
		Iterator<Equipment> iterator1 = intersection.iterator();
		while(iterator1.hasNext()) {
			Equipment intersection1 = iterator1.next();
			System.out.println(intersection1);
		}
		
		System.out.println("==== 차집합 ====");
		Set<Equipment> difference = new HashSet<Equipment>(storage1);
		difference.removeAll(storage2);
		Iterator<Equipment> iterator2 = difference.iterator();
		while(iterator2.hasNext()) {
			Equipment difference1 = iterator2.next();
			System.out.println(difference1);
		}
		
	}
		
		
		
	}
	


