package com.gn.practice;

public class Practice07 {

	public static void main(String[] args) {
//	1) 문제
//	2단부터 9단까지 구구단을 출력하는 프로그램을 만드세요.
//	아래와 같은 형식으로 9단까지 이어지게 만들어주세요.
		
		for(int i = 2 ; i <= 9 ; i++) {
			System.out.println("=== " + i + "단 ===");
			for(int j = 1 ; j <= 9; j++ ) {
				System.out.println(i + " * "+ j +" = " +(i * j));
			}
		}
				
			}
		}

