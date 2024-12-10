package com.gn.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int x = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int y = sc.nextInt();
		
		
		Practice p = new Practice();
		
		try {
			System.out.println("합 : "+p.add(x, y));
			System.out.println("곱 : "+p.muitiple(x, y));
			System.out.println("나누기 : "+p.divide(x, y));
		}catch(ArithmeticException e){
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		}finally {
			System.out.println("마지막까지 잘 도착했어요!!");
		}
		
		
	}
}
