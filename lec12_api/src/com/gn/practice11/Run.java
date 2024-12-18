package com.gn.practice11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run {
	public static void main(String[] args) {
		// 1. 오늘 날짜 출력
		LocalDateTime day1 = LocalDateTime.now();
		DateTimeFormatter dtf1 
			= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String result1 = day1.format(dtf1);
		System.out.println("오늘 날짜 : "+result1);
		// 2. 영화 개봉까지 남은 날 출력
		LocalDateTime startDay = LocalDateTime.of(2024,12,18,1,1);
		LocalDateTime endDay = LocalDateTime.of(2024,12,25,1,1);
		long berween = ChronoUnit.DAYS.between(startDay, endDay);
		System.out.println("영화 개봉까지 남은 날 : "+berween);
		// 3. 영화 개봉일의 요일 출력 -> getKoreanDayOfWeek 메소드 호출
		int yoil = endDay.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(yoil));
//		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("E요일");
//		String result2 = endDay.format(dtf2);
//		System.out.println("영화 개봉일의 요일 : "+result2);
		// 4. 개봉일 출력
		LocalDateTime day2 = LocalDateTime.of(2024,12,25,1,1);
		DateTimeFormatter dtf3 
		= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String result3 = day2.format(dtf3);
		System.out.println("영화 개봉까지 남은 날 : "+result3);
		
	}
	
	public static String getKoreanDayOfWeek(int day) {
//		System.out.println(day);
		String result = "";
		switch(day) {
		case 1 : result = "월요일"; break;
		case 2 : result = "화요일"; break;
		case 3 : result = "수요일"; break;
		case 4 : result = "목요일"; break;
		case 5 : result = "금요일"; break;
		case 6 : result = "토요일"; break;
		case 7 : result = "일요일"; break;
		}
		return result;
		
		

		
  }
}