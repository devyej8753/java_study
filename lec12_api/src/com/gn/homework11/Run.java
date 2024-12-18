package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf 	= DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : "+dtf.format(start));
		for(int i = 0 ; ; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String arr = sc.next();
			arr = arr.toUpperCase();
			// 새로 LocalTime after 선언
			LocalTime last = LocalTime.now();
			DateTimeFormatter dtf1 	= DateTimeFormatter.ofPattern("ss");
			long daysBetween = ChronoUnit.SECONDS.between(start, last);
			if("Y".equals(arr)) {
				System.out.println("경과(초) : "+daysBetween); // after-start
			}else if("N".equals(arr)) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		
		
		
		
	}

}
