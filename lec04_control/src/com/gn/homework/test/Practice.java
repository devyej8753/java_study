package com.gn.homework.test;
import java.util.Scanner;
// 기능 메소드
public class Practice {
	// 1번 기능 : 인사말 출력
	public void practice01() {
		System.out.println("안녕하세요~");
	}
	// 2번 기능 : 두개의 숫자를 입력 받아서 합 출력
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int num = sc.nextInt();
		System.out.print("숫자2 : ");
		int num1 = sc.nextInt();
		System.out.println(num+num1);
		sc.close();
	}
}
