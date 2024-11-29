package com.gn.practice;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
/*	1) 문제
	철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요.
	조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요.
	아래와 같은 기준을 따른다고 했을 때,
	사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.
*/
		// ctrl + shift + 'o' = import 자동생성
		Scanner sc = new Scanner(System.in);
		int su;
		System.out.print("조명의 밝기를 입력하세요(0~3) : ");
		su= sc.nextInt();
		String text ="";
		text += "현재 조명의 밝기 : ";
		switch(su) {
			case 0 : text += "조명을 끕니다.";break;
			case 1 : text +="어두운 조명입니다.";break;
			case 2 : text +="밝은 조명입니다.";break;
			case 3 : text +="매우 밝은 조명입니다.";break;
			default : text += "올바른 입력이 아닙니다"; break;
		}
		text +="(v)";
		System.out.println(text);
		
		
		
		
		
	}

}
