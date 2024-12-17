package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
//		1~100사이의 숫자 중에서 랜덤값을 추출하여 변수에 담으세요.
		int random = (int)(Math.random()*100)+1;
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");
//		사용자로부터 숫자를 입력 받습니다. 
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; ; i++) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
//		그다음 사용자가 랜덤값을 맞추는 데까지 몇번이 걸렸는지 출력하세요.
			if(num < random) {
				System.out.println("UP !");
			}else if(num > random) {
				System.out.println("DOWN !");
			}else {
				System.out.println("정답입니다!!");
				System.out.println(i+"회만에 맞추셨습니다.");
				break;
			}
		} 
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
