package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) { //파일이 없으면 만들어라
			dir.mkdirs();
		}
		// 2. 파일 생성
		File file = new File(dir,"sample1.dat");
		// 3. FileOutputStream 생성
		FileOutputStream out = null; // 선언을 밖에서 해주고
		try {
			out = new FileOutputStream(file); // 생성은 안에서
			// 4. 출력할 데이터 구성 (try문 안에서 해야됨)
			String str ="hello"; // sample1.dat 에다가 넣는것
			byte[] arr = str.getBytes(); // hello 잘라서 byte 단위로 만든것
			// 5. 출력
			out.write(arr);
			// 6. 플러싱(선택사항)
			out.flush();
			System.out.println(file.length()+"크기의 "+file.getParent()+" 파일 생성");
		} catch(IOException e) { // Exception 사용해도됨
			e.printStackTrace();
		}finally { //out.close(); 사용하려면 try catch 문 한번더 사용해야됨
			try {
				// 7. 스트림 닫기
				if(out != null) { 
					out.close(); // 그냥쓰면 안되고 if문 써야됨
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
