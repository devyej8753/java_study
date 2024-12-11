package com.gn.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		p.printSum("3", "5");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int su = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int su1 = sc.nextInt();
		int sus = su+su1;
		System.out.println("합 : "+sus);
	}
	
}
