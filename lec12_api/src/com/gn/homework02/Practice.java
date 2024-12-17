package com.gn.homework02;

public class Practice {
	
	public String takeState(String takeState) {
		String result = null;
		String[] arr = takeState.split(" ");
		for(String s : arr) {
			int idx = s.indexOf("구");
			if(idx != -1 && s.length()-1 == idx) {
				result = s;
			}
		}
		return result;
	}
}
