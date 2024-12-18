package com.gn.practlce02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {
	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub");
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-","");
		File file = new File(dir,uuid+".txt");
		
		try {
			if(file.exists() == false) {
				if(file.createNewFile()){
					System.out.println("디렉토리 생성 성공");
				}else {
					System.out.println("디렉토리 생성 실패");
				}
			}else {
					System.out.println("이미 존재하는 디렉토리");
					
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
