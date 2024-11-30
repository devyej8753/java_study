package com.gn.homework;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int num = sc.nextInt();
		System.out.print("기온 : ");
		int tem = sc.nextInt();
		if(num==3||num==4||num==5) {
			System.out.println("봄");
			
			
		}else if(num==6||num==7||num==8) {
			System.out.println("여름");
			if(tem >= 35) {
				System.out.println("폭염 경보");
			}else if(tem >= 33) {
				System.out.println("폭염 주의보");
			}
			
		}else if(num==9||num==10||num==11) {
			System.out.println("가을");
			
		}else if(num==12||num==1||num==2) {
			System.out.println("겨울");
			if(tem <= -12) {
				System.out.println("한파 주의보");
			}else if(tem <= -15) {
				System.out.println("한파 경보");
			}else {
				System.out.println("해당된 계절이 없습니다");
			}
		}
		
		
		
	}
	
}


//			전에 이렇게풀고 오류 난것

//		if(num==1||num==2||num==12) {
//			
//			if(tem <= -12) {
//				System.out.println("한파 주의보");
//			}else if(tem <= -15) {
//				System.out.println("한파 경보");
//			}else if(num==3||num==4||num==5) {
//				
//			}else if(num==6||num==7||num==8) {
//				if(tem >= 35) {
//					System.out.println("폭염 경보");
//				}else if(tem >= 33) {
//					System.out.println("폭염 주의보");
//				}
//			}else if(num==9||num==10||num==11) {
//			}else { 
//				System.out.println("해당된 계절이 없습니다.");
//			}

//		}
