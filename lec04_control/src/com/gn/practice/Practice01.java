package com.gn.practice;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		String name = sc.nextLine();
		int checknum = sc.nextInt();
		if(checknum > 0) {
		System.out.println("숫자 :"+checknum);
	//	String su = sc.nextLine();
		System.out.println("양수입니다");

		}
	}
}