package com.gn.practice03;

import java.util.*;


public class MovieTheater {
	public static void main(String[] args) {
		
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B2");
		seats.add("B1");
		System.out.println("초기 좌석 목록: "+seats);
		
		seats.add(2,"A3");
		System.out.println("좌석 추가 후 목록: "+seats);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석 : ");
		String seats1 = sc.nextLine();
		
		int idx = seats.indexOf(seats1);
		
		if(idx!= -1) {
			// A3 -> 2 -> 2번을 A3(예약)
			// B2 -> 3 -> 3번을 B2(예약)
			seats.set(idx, seats1 + "(예약)");
		}else {
			System.out.println(seats1+"는(은) 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후: "+seats);
		
		System.out.print("삭제 좌석: ");
		String seats2 = sc.nextLine();
		if(seats.contains(seats2)) {
			seats.remove(seats2);
		}
		if(seats.indexOf(seats2)!= -1) {
			System.out.println("");
		}else {
			System.out.println(seats2+" 좌석은 목록에 없습니다.");
		}
		System.out.println("좌석 삭제 후: "+seats);
		Collections.sort(seats);
		System.out.println("좌석 정렬 후: "+seats);
		
		
	}
}
