package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수 :");
		int su =sc.nextInt();
		System.out.print("소프트웨어개발 점수 :");
		int su1 =sc.nextInt();
		System.out.print("데이터베이스구축 점수 :");
		int su2 =sc.nextInt();
		System.out.print("프로그래밍언어활용 점수:");
		int su3 =sc.nextInt();
		System.out.print("정보시스템구축관리 점수 :");
		int su4 =sc.nextInt();
		
		int sum = (su+su1+su2+su3+su4);
		int avg = sum/5;
		if(su >=40&&su1>=40&&su2>=40&&su3>=40&&su4>=40) {
			if(avg>=60){
			System.out.println("합격을 축하합니다!");
			}
		}else {
			System.out.println("평균 점수 60점 미만으로 불합격입니다");
		}
			
			
			
			
	}		
}	
