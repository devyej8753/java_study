package com.gn.practice;
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
//		1) 문제
//	사용자로부터 두 개의 정수를 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 :");
		int su1 = sc.nextInt();
		System.out.print("두번째 :");
		int su2 = sc.nextInt();
//	삼항 연산자를 사용해서 두 수중에서 작은 수를 찾아서 출력하세요.
//		int bool = su1 < su2? su1:su2;
		//System.out.println(bool);
		
//	사용자로부터 3개의 정수를 입력 받으세요.
		System.out.print("세번째 :");
		int su3 = sc.nextInt();
//	중첩 삼항 연산자를 사용해서 세 개의 정수 중에서 가장 큰 수를 출력하세요.
		int max = su1 > su2? (su1 >su3 ? su1 : su3) : (su2 > su3? su2: su3);
		System.out.println("세 대의 정수 중에 가장큰수 :"+max);
		
	}

}
