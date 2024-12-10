package com.gn.study.model.vo;
// 예외 출력
public class Calculator {
	public int divide(int a, int b) {
//	1. 모든 블록에 return을 쓴다.
//		try {
//			return a/b;
//		}catch(ArrayIndexOutOfBoundsException e) {
//			return -1;
//		}
//	2. 임의의 변수를 활용한다.
		int answer = -1;
		try {
			answer = a/b;
		}catch(NullPointerException e) {
			
		}catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println("오류 : "+e.getMessage());
			System.out.println(e); //toString 방법
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("확인");
		return answer;
		
		
		
	}
}
