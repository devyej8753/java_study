package com.gn.homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("생년월일 : ");
		String num = sc.next();
		
		String firstName = name.substring(0, 1);
		String nums = num.substring(2, 4);
		String nums1 = num.substring(6, 8);
		String lastname = name.substring(1);
		System.out.println("암호 : "+firstName+nums+nums1+lastname);
		
		
		
		
		
	}

}
