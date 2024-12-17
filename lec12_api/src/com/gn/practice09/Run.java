package com.gn.practice09;

import java.util.*;

public class Run {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2024, 1-1, 1);
		Calendar today = Calendar.getInstance();
		long days = today.getTimeInMillis()-cal.getTimeInMillis();
		days = days/1000;
		days = days/(24*60*60);
		System.out.println(days+"일");
		
	}

}
