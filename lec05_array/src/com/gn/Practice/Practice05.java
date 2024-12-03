package com.gn.Practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		int[] scores = {54,23};
		Scanner sc = new Scanner(System.in);
		System.out.print("길동이 : ");
		int su = sc.nextInt(); 
		int[] newscores = new int[scores.length+1];
		for(int i = 0 ; i < scores.length ; i++) {
			newscores[i] = scores[i];			
		}
		newscores[newscores.length-1] = su;
		int sum = 0;
		for(int num : newscores) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/newscores.length);
		}
	}



