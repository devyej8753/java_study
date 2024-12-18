package com.gn.homework11;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		DateTimeFormatter dtf1 	= DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : "+dtf1.format(start));
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
	}

}
