package com.gn.homework;
import java.util.Scanner;
public class HomeWork03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 :");
		int su = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int su1 = sc.nextInt();
		System.out.print("세 번째 정수 :");
		int su2 = sc.nextInt();
		
		int min = su < su1 ? (su < su2 ? su : su2) : (su1 < su2 ? su1 : su2);
		System.out.println("세 수 중에서 가장 작은 수는 "+min+"입니다");
			
			
			
	//	int big2 = x > y ? (x >z ? x : z) : (y > z? y : z);
			
	}

}



