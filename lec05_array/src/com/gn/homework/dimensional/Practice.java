package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		int[] su = {152, 180, 165, 158, 171};
		for(int i = 0 ; i < su.length-1  ; i++) {
			
			for(int j = i + 1 ; j<su.length ; j++) {
				
				if(su[i]>su[j]) {
					int tem = su [i];
					su[i] = su[j];
					su[j] = tem;
				}
			}
		}
		int num = 0;
		for(int d : su) {
			System.out.print(d);
			num++;
				if(num ==su.length) {
					continue;
			}
				System.out.print(",");
		}
	}
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int total = 0;
		int[] arr = new int[num];
		for(int i = 0 ; i <= arr.length -1 ; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 :");
			int sus = sc.nextInt();
			arr[i] = sus;
			}
		for(int sus : arr) {
			System.out.print(sus+" ");
			total += sus;
		}
		System.out.print("\n");
		System.out.print("총합 : "+total);
	
	}
	public void practice03() {
		
	}
	public void practice04() {
		
	}
	public void practice05() {
		
	}
	public void practice06() {
		
	}
}
