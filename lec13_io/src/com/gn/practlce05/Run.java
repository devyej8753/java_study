package com.gn.practlce05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		File file = new File(dir,"애국가1.dat");
		
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			byte[] arr = new byte[(int)file.length()];
			int idx = 0;
			int date ;
			while(true) {
				date = in.read();
				if(date == -1) break;
				arr[idx++] = (byte)date;
			}
			String str = new String(arr);
			System.out.println(str);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
