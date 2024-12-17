package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) { 
//		- 사용자로부터 소수점이 있는 숫자와 10의 제곱수를 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자 : ");
		double num = sc.nextDouble();
		System.out.print("10의 제곱수 : ");
		int nums = sc.nextInt();
//		- 입력받은 제곱수만큼 자리수에서 소수점을 반올림하여 출력합니다.
		double after = Math.round(num*Math.pow(10, nums))/Math.pow(10, nums);
		System.out.println(after);
	
	
	}
}
