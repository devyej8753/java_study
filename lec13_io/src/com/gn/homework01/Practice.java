package com.gn.homework01;

import java.io.*;


public class Practice {
	
	public String method1(String method1) {
		
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir,"나비야1.dat");
		
		try(FileOutputStream out = new FileOutputStream(file)){
			byte[] arr = method1.getBytes();
			out.write(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
			}
			return method1;
		}
		public String method2(String method2) {
			// method2
			File dir2 = new File("C:\\test\\sub");
			if(dir2.exists() == false) {
				dir2.mkdirs();
			}	
			File file2 = new File(dir2,"나비야2.dat");
			try(BufferedOutputStream bis
					= new BufferedOutputStream(new FileOutputStream(file2))){
				byte[] arr2 = method2.getBytes();
				bis.write(arr2);
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return method2;
	}
	
	
}
