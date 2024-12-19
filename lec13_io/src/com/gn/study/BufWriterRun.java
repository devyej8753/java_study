package com.gn.study;

import java.io.*;

public class BufWriterRun {
	
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample2.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//		try (FileWriter fw = new FileWriter(file)){	
//			fw = new FileWriter(file,true); // true 하면 추가 계속됨
//			bw = new BufferedWriter(fw);
			
			bw.write("오이싯쿠나레");
			bw.newLine();
			bw.write("모에모에뀨!.");
			bw.newLine();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(bw != null) bw.close);
//				if(fw != null) fw.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}
