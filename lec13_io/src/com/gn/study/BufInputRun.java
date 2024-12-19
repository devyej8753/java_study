package com.gn.study;

import java.io.*;

public class BufInputRun {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\241219");
		File file = new File(dir, "sample3.dat");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] arr = new byte[(int)file.length()];
			byte[] size = new byte[3];
			int idx = 0;
			while(true) {
				int date = bis.read(size);
				if(date == -1) break;
				System.arraycopy(size, 0, arr, idx, date);
				idx += date;
			}
			String str = new String(arr);
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null)bis.close();
				if(fis != null)fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
