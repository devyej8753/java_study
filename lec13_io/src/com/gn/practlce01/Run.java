package com.gn.practlce01;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		
//		File file = new File("C:\\test\\sub"+"\\"+year+"\\"+month+"\\"+day);
//		if(!file.exists()) {
//			if(file.mkdirs()) {
//				System.out.println("디렉터리 생성 성공");
//			}else {
//				System.out.println("디렉터리 생성 실패");
//			}
//		}else {
//			System.out.println("이미 존재하는 디렉토리");
//		}
		File dir2 = new File("C:\\test\\sub");
	
		p.deleteFile(dir2);
		
		
		
		
	}

}
