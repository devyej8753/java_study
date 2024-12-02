package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		int sum = 0;
		while(true) {
			
			if(1<=num&&num<=50) {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						sum += i;
					}
				}
				System.out.println("합계 : " + sum);
				sc.close();
				break;
			} else {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				System.out.print("정수(1~50) : ");
				num = sc.nextInt();
			}
		}
		
	}
	public void practice02() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			i = sc.nextInt();
			if(i==0) {
				break;
			}else if(i>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
			for(;i<=9;i++) {
				if(i<0) {
					System.out.println("양수만 입력해주세요.");
					break;
				}
			System.out.println("=== "+i+"===");	
			for(int j = 1 ;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		}
		sc.close();
		
	}
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("입력 : ");
			String name = sc.nextLine();
			
			if(name.equals("탈출")) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
			System.out.println(name);
	}
		
		}
		
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		String sum;
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			sum = sc.nextLine();
		} while(sum.equals("yes"));
		System.out.println("게임을 종료합니다.");
		sc.close();
		
		}
	

		
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int sums = 0;
		int number;
		
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			number = sc.nextInt();
			if (number == 0) {
				break;
			}else if (number > 0) {
				sums += number;
			}
			
		}
		System.out.println("양수의 합계 :" + sums);
		sc.close();
	}
	
	public void practice06() {
		
	}
	public void practice07() {
		
	}
	public void practice08() {
		
	}
}

	