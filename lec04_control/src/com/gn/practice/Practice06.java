package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
		
	
		
		int sum = 0;
		for(int i = 1; ; i++) {
			sum += i;
			System.out.println(sum);
			if(sum >= 100) {
				break;
			}
		//	System.out.println(sum);
		}
		System.out.println("초가된 합 : " + sum );
	}

}
