package com.gn.practice;

public class Practice01 {
	public static void main (String[] args) {
		
	// 1) 문제
	// 철수는 변수를 배우지 못한 상태에서 계산식을 작성했습니다.
	// 변수를 배운 후에 변수 개념을 도입하여 코드를 수정하고자 합니다.
	// 철수가 변수를 배우기 전 작성한 코드를 보고, 변수 개념을 도입하여 코드를 효율적으로 수정하세요.
		
		
		//System.out.println("기존 코드");
		System.out.println(100 + 10);
		System.out.println(10 * (100 + 10));
		System.out.println((10 * (100 + 10)) / 10);
		
		//System.out.println("변수 사용후 코드");
		int a;
		a = 100;
		int b = 10;
		System.out.println(a + b); 
		System.out.println(b * (a + b));
		System.out.println((b * (a + b)) / b);
	}

}
