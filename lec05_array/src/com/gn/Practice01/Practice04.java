package com.gn.Practice01;

public class Practice04 {

	public static void main(String[] args) {
		int[] ages = {20, 18, 22, 19, 21};
		int max = ages[0];
		for(int i = 0 ; i < ages.length ; i++) {
				max = ages[i];
				if(ages[i]>max) {
			}
			
		}
		System.out.println("가장 나이가 많은 학생의 나이 :"+max);
		
		int min = ages[0];
		for(int i = 0 ; i < ages.length ; i++) {
			if(ages[i]<min) {
				min = ages[i];
			
			}
		}
		System.out.println("가장 어린 학생의 나이 :"+min);
		

	}

}
