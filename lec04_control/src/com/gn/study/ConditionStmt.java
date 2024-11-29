package com.gn.study;

public class ConditionStmt {

	public static void main(String[] args) {
		// 1. if문
		int number = 10;
		if(number > 5) {
			int su = 2; 
			System.out.println("number는 5보다 큽니다.");
			System.out.println(su);			
		} 
//			System.out.println(su); if 문 안에서만 가능
		// 2. if~else문
		int num = 0;
		if(num >0) {
			//양수
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		// 3. if~else if ~else 문
		int a = 3;
		if(a >= 9) {
			System.out.println("9이상");
		} else if(a >= 6) {
			System.out.println("9미만 && 6 이상");
		} else if(a >= 3) {
			System.out.println("9미만 && 6 미만 && 3이상");
		} else {
			System.out.println("3미만");			
		}
		
		// 중첩 if문
		// 변수의 값이 양수 vs 음수
		// 양수 -> 짝수 vs 홀수
	
		int target = -5;
		if(target > 0) {
			// 양수
			if(target % 2 == 0) {
				// 짝수
			} else {
				// 홀수
			}
		} else if( target < 0) {
			// 음수
		} else {
			// 0
		}
		
		// 5. switch문
		int day = 2; // 화요일
		// 오늘은 0요일 입니다.
		String text = "";
		switch(day) {
			case 0 :
				text = "일";
				break;
			case 1 :
				text = "월";
				break;
			case 2 :
				text = "화";
				break;
			default :text = "모르는 ";
			 	break;
				
				
		}
		System.out.println(text+"요일 입니다.");
		
		
	}
	
}