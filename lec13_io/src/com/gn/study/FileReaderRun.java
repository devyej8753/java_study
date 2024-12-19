package com.gn.study;

import java.io.*;

public class FileReaderRun {
	
	public static void main(String[] args) {
		// 1. 디렉토리, 파일 생성 (디렉토리가 읽을때 있으면 한번에 해도됨)
		File file = new File("C:\\test\\sub\\sample1.txt"); 
		// 2. 파일 입력 스트림 선언(텍스트)
		FileReader fr = null;
		try {
			// 3. 파일 입력 스트림 생성
			fr = new FileReader(file);
			// 4. 읽을 단위 지정 -> int / char[]
			StringBuilder sb = new StringBuilder();
			// (1) int
//			while(true) {
//				int date = fr.read();
//				if(date == -1)break;
//				sb.append((char)date); // char 을 써야지 문자가 나옴 없으면 유니코드만 나옴
//			}
			// (2) char[]
			char[] std = new char[3];
			while(true) {
				int date = fr.read(std);
				if(date == -1)break;
				sb.append(std, 0, date);
			}
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
