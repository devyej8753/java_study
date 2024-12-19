package com.gn.homework02;

import java.io.*;

public class Practice {
	
	public String method1(String method1) {
		File file1 = new File("C:\\test\\sub\\나비야1.dat");
		try(FileInputStream in = new FileInputStream(file1)){
			byte[] arr = new byte[(int)file1.length()];
			int idx = 0;
			int date;
			while(true) {
				date = in.read();
				if(date == -1)break;
				arr[idx++] = (byte)date;
			}
			String str = new String(arr);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return method1;
	}
	public String method2(String method2) {
		File file2 = new File("C:\\test\\sub\\나비야2.dat");
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2))){
			byte[] arr1 = new byte[(int)file2.length()];
			int idx1 = 0;
			int date1;
			while(true) {
				date1 = bis.read();
				if(date1 == -1) break;
				arr1[idx1++] = (byte)date1;
			}
			String str1 = new String(arr1);
			System.out.println(str1);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return method2;
	}
	

}
