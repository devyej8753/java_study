package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
//		- 철수는 새로운 카페를 준비중인 점주입니다.
//		- 가게 오픈까지 남은 준비 기간 동안의 일정을 관리해야합니다.
		Calendar today = Calendar.getInstance();
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		- 카페 오픈일은 2025년 1월 24일입니다.
		Calendar openCal = Calendar.getInstance();
		openCal.set(2025,1-1,24);
//	    1. 오늘 날짜 기준으로 카페 오픈일까지 남은 날짜 수
		long diff = openCal.getTimeInMillis()-today.getTimeInMillis();
		diff = diff/1000;
		diff = diff/(24*60*60);
//		2. 카페 오픈일이 속한 달의 마지막 날
		Calendar lastCal = Calendar.getInstance();
		int last = lastCal.getActualMaximum(Calendar.DAY_OF_MONTH);
//	    3. 카페 오픈일의 요일
		Date openDate = openCal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E요일");
		
		
		
		
		System.out.println("오늘날짜 : "+sdf.format(date));
		System.out.println("카페 오픈일까지 남은 날 : "+diff+"일");
		System.out.println("오픈달의 마지막 날 : "+last+"일");
		System.out.println("카페 오픈일의 요일 : "+sdf1.format(openDate));
		
		
		
		
	}
}
