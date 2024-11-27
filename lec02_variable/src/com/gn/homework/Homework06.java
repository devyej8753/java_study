package com.gn.homework;
import java.util.Scanner;
public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요:");
		String nub1 = sc.nextLine();
		char a = nub1.charAt(0);
		int b = a - '0';
		int c = b * b;
		System.out.println("입력한 숫자의 제곱은"+c +"입니다");
		
		
		
/*	## 1) 문제
	사용자로부터 한 자리 숫자를 입력 받아서
	해당 숫자의 제곱을 출력하는 프로그램을 작성하세요.
	단, 문자열 형태로 값을 입력 받은 다음,
	char 타입의 변수에 저장하세요.
	💡 문자열 형태로 입력받은 한자리 값을 char타입의 변수로 변환하는 코드는 sc.nextLine().charAt(0); 입니다.
*/
		

	}

}
