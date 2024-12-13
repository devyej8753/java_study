package com.gn.practice11;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.gn.study.model.vo.Snack;

import java.util.Set;
import java.util.TreeMap;

public class Run {
	public static void main(String[] args) {
		
		Map<String,Fruit> map = new TreeMap<String,Fruit>();
		map.put("3 : ", new Fruit("포도","강화도",3,35000));
		map.put("2 : ", new Fruit("사과","영주",5,25000));
		map.put("1 : ", new Fruit("귤","제주",10,15000));
		map.put("4 : ", new Fruit("배","나주",7,50000));
//		System.out.println(map);
		System.out.println("=== 전체 데이터 조회 ===");
		Set<String> keyset = map.keySet();
		Iterator<String> itKey = keyset.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			Fruit value = map.get(key);
			System.out.println(key+value);
		}
		
		
		System.out.println("=== 가격 20000원 이상 ===");
		Set<Entry<String,Fruit>> entrySet = map.entrySet();
		Iterator<Entry<String,Fruit>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String,Fruit> entry = itEntry.next();
			String key = entry.getKey();
			Fruit value = entry.getValue();
			if(value.getPrice()>20000) {
				System.out.println(key+value);
			}
		}
		System.out.println("=== 이름이 한글자인 과일 ===");
		Set<String> set = map.keySet();
		Iterator<String> itset = set.iterator();
		while(itset.hasNext()) {
			String key = itset.next();
			Fruit value = map.get(key);
			if(value.getName().length()<=1) {
				System.out.println(key+value);
			}
		}
		System.out.println("=== 포도 가격 인상 ===");
		itEntry = entrySet.iterator();
		map.get("3 : ").setPrice(28000);
		while(itEntry.hasNext()) {
			Entry<String,Fruit> entry = itEntry.next();
			String key = entry.getKey();
			Fruit value = entry.getValue();
			if(value.getPrice()==28000) {
				System.out.println(key+value);
			}
		}
				
		
		
		
		
		
	}

}
