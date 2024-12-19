package com.gn.practlce07;

import java.io.*;

public class Run {
	public static void main(String[] args) {
		
		File file = new File("c:/test/sub/practice/output.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			StringBuilder sb =new StringBuilder();
			while(true) {
				String date = br.readLine();
				if(date == null) {
					break;
				}
				sb.append(date).append("\n");
			}
			System.out.print(sb.toString());
			System.out.println("공백 제외 글자수 : "+sb.toString().replace(" ","").length());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(fr != null)fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
