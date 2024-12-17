package com.gn.homework04;

import java.util.*;

public class Run {
	public static void main(String[] args) {
//		- 사용자로부터 문자를 반복해서 입력받으세요.
		Scanner sc = new Scanner(System.in);
		String result = "";
		String str = "";
		
		while(true) {
			System.out.print("문자열 : ");
			result = sc.next();
			if(result.toUpperCase().equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				str += result;
			}
		}
		System.out.println("최종 문자열 : "+str);
		sc.close();
	}

}
