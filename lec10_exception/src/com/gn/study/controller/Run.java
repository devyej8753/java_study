package com.gn.study.controller;

import com.gn.study.model.vo.Calculator;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		// 예외 상황 일때
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
		}finally {
			System.out.println("계산끝!!");
		}
			
			
		System.out.println("==== Null 조심 ====");
		
		String[] arr = new String[3];
		try {
		System.out.println(arr[0].length());
		}catch(NullPointerException e) {
			System.out.println("오류가 발생했어요!!");
		}
//		System.out.println(null.length);
		
		System.out.println("==== 배열 조심 ====");
		int[] numbers = {1,2,3};
		try {
		System.out.println(numbers[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요!!");
		}
		
		
		Calculator c = new Calculator();
		c.divide(3, 0);
		
		
	}
}
	