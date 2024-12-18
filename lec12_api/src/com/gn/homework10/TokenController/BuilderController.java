package com.gn.homework10.TokenController;

public class BuilderController {
	
	public BuilderController() {}
	
	public String afterReplace(String str) {
		str = str.replace(" ","");
		return str;
	}
	public String firstCap(String input) {
		String[] arr = input.split("");
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0].toUpperCase());
		for(int i = 0 ; i < arr.length ; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
//		char firstStr = input.charAt(0);
//		
//		char first = Character.toUpperCase(firstStr);
//		
//		return  input.replace(input.charAt(0), first);
	}
	public int findChar(String input, char one) {
	int result = 0;
	for(char c : input.toCharArray()) {
		if(c == one) {
			result++;
		}
	}
	return result;
	
	}
	
	
	
	
}
