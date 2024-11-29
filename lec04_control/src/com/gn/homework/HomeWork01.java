package com.gn.homework;
import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int su = sc.nextInt();
		String name = new String();
		if (su > 65 ) {
			name = "무료";
		} else if (su >19 ) {
			name = "30000원";
		} else if (su >13 )	{
			name = "20000원";
		} else if (su >3 ) {
			name = "10000원";
		} else {
			name = "무료";	
		}
		
		System.out.println("당신의 놀이동산 요금은"+name+"입니다");
		
		
		
	}

}
