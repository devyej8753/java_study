package com.gn.practice;
import java.util.Scanner;
public class Practince02 {

	public static void main(String[] args) {
/*		사용자로부터 성적을 입력 받아서,
		성적을 기준으로 학점을 부여하는 프로그램을 구성해주세요.
		90점보다 높은 경우 : A
		80(X) ~ 90(O)점 사이 : B
		70(X) ~ 80(O)점 사이 : C
		60(X) ~ 70(O)점 사이 : D
		나머지 : F
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int num = sc.nextInt();
		String name = new String();
		if(num >=90) {
		//	System.out.println("A");
			name = "A";
		} else if(num >=80) {
		//	System.out.println("B");
			name = "B";
		} else if(num >=70) {
		//	System.out.println("C");
			name = "C";
		} else if(num >=60) {
		//	System.out.println("D");
			name = "D";
		} else {
		//	System.out.println("F");
			name = "F";
		}
//		System.out.println(name);
		
		System.out.println("당신의 학점은 "+name+" 입니다.");

		
		
		
		
		
		
	}

}
