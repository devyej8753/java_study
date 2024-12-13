package com.gn.practice10.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Run {
	public static void main(String[] args) {
		Map<String,Planet> plmap = new HashMap<String,Planet>();
		plmap.put("Mercury", new Planet("수성",4879,0.24));
		plmap.put("Venus", new Planet("금성",12104,0.62));
		plmap.put("Earth", new Planet("지구",12742,1.0));
		plmap.put("Mars", new Planet("화성",6779,1.88));
		
		Set<String> keySet = plmap.keySet();
		Iterator<String> itkey = keySet.iterator();
		System.out.println("*** keySet() 사용 ***");
		while(itkey.hasNext()) {
			String key = itkey.next();
			Planet value = plmap.get(key);
			System.out.println("행성이름: "+key+":"+"("+value.getName()+") "+"지름: "+value.getDiameter()
			+" 공전주기: "+value.getperiod()+"년");
		}
		
		
		
		Set<Entry<String, Planet>> entrySet = plmap.entrySet();
		Iterator<Entry<String, Planet>> itEntry = entrySet.iterator();
		System.out.println("*** entrySet() 사용 ***");
		while(itEntry.hasNext()) {
			Entry<String, Planet> entry = itEntry.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("키: "+key+" 값: "+value);
		}
		
		
	}

}
