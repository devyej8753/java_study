package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {

	public void practice01() {
		
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int num = sc.nextInt();
		String name = new String();
		if(num >= 65) {
			name = "무료";
		}else if (num >= 19) {
			name = "30000원";
		}else if (num >= 13) {
			name = "20000원";
		}else if (num >= 3) {
			name = "10000원";
		} else {
			name ="무료";
		}
		sc.close();
		System.out.println("당신의 놀이동산 요금은 "+ name +"입니다");
		
	 }
	
		
	public void practice02() {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int num1 = sc.nextInt();
		System.out.print("기온 : ");
		int num2 = sc.nextInt();
		
		
	}
		
		
		
		
	}