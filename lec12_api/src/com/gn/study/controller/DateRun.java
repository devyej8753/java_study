package com.gn.study.controller;

import java.util.Calendar;

public class DateRun {
	public static void main(String[] args) {
		// Calendar
		Calendar call = Calendar.getInstance();
		System.out.println(call);
		
		int year = call.get(Calendar.YEAR);
		int mon = call.get(Calendar.MONTH)+1;
		System.out.println(year+"년"+mon+"월");
		
		Calendar cal2 = Calendar.getInstance();
		int year2 = cal2.get(Calendar.YEAR);
		int mon2 = cal2.get(Calendar.MONTH)+1;
		int date2 = cal2.get(Calendar.DATE);
		int day2 = cal2.get(Calendar.DAY_OF_WEEK);
		String str2 = "";
		switch(day2) {
		case 1 : str2 = "일"; break;
		case 2 : str2 = "월"; break;
		case 3 : str2 = "화"; break;
		case 4 : str2 = "수"; break;
		case 5 : str2 = "목"; break;
		case 6 : str2 = "금"; break;
		case 7 : str2 = "토"; break;
		}
		System.out.println(year2+"년 "+mon2+"월 "+date2+"일 "+day2+"요일");
		
		// 날짜 변경(1) : set
		Calendar christmas = Calendar.getInstance();
		christmas.set(Calendar.DATE,25);
		christmas.set(2024, 12-1, 25);
		System.out.println(christmas);
		
		// 날짜 변경(2) : add
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.DATE, -7);
		
		// 문자열 형태 날짜 정보로 변환
		String toDay = "2024-05-14";
		String[] temp = toDay.split("-");
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(Integer.parseInt(temp[0]),
				Integer.parseInt(temp[1])-1,
				Integer.parseInt(temp[2]));
		cal4.add(Calendar.MONTH, -1);
		
		System.out.println(cal4);
				
		// 두 날짜 사이의 차이 구하기
		Calendar cal5 = Calendar.getInstance();
		cal5.set(2024,10-1,16);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()-cal5.getTimeInMillis();
		// 1초 == 1000ms
		diff = diff/1000;
		// 24시간 * 60분 * 60초
		diff = diff/(24*60*60);
		System.out.println(diff);
		
		// 최대값 구하기
		Calendar cal6 = Calendar.getInstance();
		int last = cal6.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("마지막 날짜 : "+last);
		
		
		
		
	}

}
