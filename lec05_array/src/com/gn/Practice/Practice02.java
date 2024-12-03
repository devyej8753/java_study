package com.gn.Practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		int[] num = {-62,107,-12,89,-35};
		for(int su : num ) {
			if(su>50) {
			System.out.println(su);
		}
		}			
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		int a = sc.nextInt();
		System.out.print("입력 :");
		int b = sc.nextInt();
		System.out.print("입력 :");
		int c = sc.nextInt();
		System.out.print("입력 :");
		int d = sc.nextInt();
		System.out.print("입력 :");
		int e = sc.nextInt();
		int[] numbers = {a,b,c,d,e};
		for(int se : numbers ) {
			if(se>50)
				System.out.println(se);
		}
		
	}

}
