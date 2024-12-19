package com.gn.homework03.model.dao;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File checkFile = new File("C:\\test\\sub",file);
		if(checkFile.exists() != false) {
			checkFile.mkdirs();
		}
		return checkFile.exists();
	}
	public void fileSave(String file, String s) {
		File savefile = new File(file);
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))){
			byte[] arr = new byte[(int)savefile.length()];
			int idx = 0;
			int date;
			while(true) {
				date = in.read();
				if(date == -1)break;
				arr[idx++] = (byte)date;
			}
			String save = new String(s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
	}
	public StringBuilder fileOpen(String file) {
		return null;
	}
	public void fileEdit(String file, String s) {
		
	}
	
	
}
