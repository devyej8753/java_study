package com.gn.study;

import java.io.*;

public class BufReaderRun {
	public static void main(String[] args) {
		File file = new File("C:\\test\\sub\\sample2.txt");
		
		FileReader fr = null;
		BufferedReader br =null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// 읽을 단위 지정
			// StringBuilder
			StringBuilder sb = new StringBuilder();
			// while문
			while(true) {
				String date = br.readLine();
				if(date == null) {
					break;
				}
				sb.append(date).append("\n"); 
			}
			System.out.println(sb.toString());
			// 출력
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(fr != null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
