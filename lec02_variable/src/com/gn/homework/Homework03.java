package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
//		## 1) 문제

//	Scanner로 문자열을 입력 받으세요.

//	그 다음, 해당 문자열의 첫번째, 두번째, 세번째 문자를 출력해주는 시스템을 만들어주세요.

		Scanner sc = new Scanner (System.in);
		System.out.print("문자열을 입력하세요 :");
		String su = sc.nextLine();
		char a = su.charAt(0);
		char b = su.charAt(1);
		char c = su.charAt(2);
			
		System.out.println("첫번째 문자 :"+a);
		System.out.println("두번째 문자 :"+b);
		System.out.println("세번째 문자 :"+c);
		
	}

}
