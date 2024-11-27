package com.gn.homework;
import java.util.Scanner;
public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :");
		double num = sc.nextDouble();
		System.out.print("영어 :");
		double num1 = sc.nextDouble();
		System.out.print("수학 :");
		double num2 = sc.nextDouble();
		System.out.println("총점 :"+(int)(num+num1+num2));
		System.out.println("평균 :"+(int)((num+num1+num2)/3));
//  1) 문제
//	실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받으세요.
//	그 다음, 총점과 평균을 출력하세요.
//	이때, 총점과 평균은 정수형으로 처리하세요. 
//	실수값을 더할때는 + 부호를, 나누기할 때는 / 부호를 사용합니다.
		

	}

}
