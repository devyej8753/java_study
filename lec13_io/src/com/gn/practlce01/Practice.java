package com.gn.practlce01;

import java.io.File;

public class Practice {
	
	public void deleteFile(File dir) {
			
		File[] files =dir.listFiles();
		if(files.length>0) {
			for(File f : files) {
				if(f.isFile()) {
					String name = f.getName();
//					String pathName = dir.toString()+"\\";
//					name = name.replace(pathName,"");
					System.out.println(name+" 파일삭제");
					f.delete();
				}
			}
		}
		
		
	}
//		if(dir.exists()) {
//			if(dir.delete()) {
//				System.out.println("삭제 성공");
//			}else {
//				System.out.println("삭제 실패");
//			}
//		}else {
//			System.out.println(dir+" 파일 삭제");
//		}
//		return;
	

}
