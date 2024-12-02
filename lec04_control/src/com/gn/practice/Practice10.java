package com.gn.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1) 문제
//		키보드로 숫자(정수)를 입력 받습니다.
//		입력받은 값으로부터 시작해서 값이 10이될 때까지 하나씩 커지면서 출력하세요.
//		최초에 입력된 숫자가 10보다 크더라도 반드시 출력하세요.
//		do~while문을 사용하세요.
		System.out.print("숫자 :");
		int num = sc.nextInt();
		
		do {
			System.out.println(num);
			num++;
		}while(num<=10);
	
		
	}

}
