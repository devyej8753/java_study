package com.gn.practlce03;

import java.io.File;
import java.io.FileOutputStream;

public class Run {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir,"애국가1.dat");
		String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
				+ "\n우리나라 만세 무궁화 삼천리 화려강산"
				+ "\n대한사람 대한으로 길이 보전하세";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			String str = song;
			byte[] arr = str.getBytes();
			out.write(arr);
			out.flush();
			System.out.println(file.length()+" 크기의 "+file.getParent()+" 파일 생성");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			
		}
		
		
		
		}
	}
}


