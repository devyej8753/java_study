package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
/*	## 1) 문제
	철수는 화이트 데이를 맞아서 친구들에게 사탕을 나눠주려고 해요.
	인싸인 철수는 매일 친구의 수가 달라지고,
	사탕을 몇 개 살 수 있는지도 아직 알 수 없어요.
	그래서 철수의 친구 수와 구입한 사탕 개수를 입력하면
	친구 한명당 최대 몇개의 사탕을 나눠줄 수 있고,
	남는 사탕의 개수는 몇개인지를 
	출력하는 시스템을 만들고자 합니다.	
	
	2) 출력 예시
  	친구 수 : 29
    사탕의 수 : 100
    1인당 사탕 개수 : 3개
    남는 사탕 개수 : 13개
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int num =sc.nextInt();
		System.out.print("사탕의 수 : ");
		int num1 =sc.nextInt();
		System.out.println("1인당 사탕 개수 : "+(num1/num));
		System.out.println("남는 사탕 개수 : "+ (num1%num));
	}

}
