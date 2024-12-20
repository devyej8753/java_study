package com.gn.homework03.model.dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {
	
	String total = new String("C:\\homework3");
	
	public boolean checkName(String file) {
		File checkFile = new File(total,file);
		if(checkFile.exists() != false) {
			checkFile.mkdirs();
		}
		return checkFile.exists();
	}
	public void fileSave(String file, String s) {
		File savefile = new File(total);
//		if (savefile.exists()==false) {
//			savefile.mkdirs();
//		}
		File arr = new File(savefile,file);
		try(BufferedOutputStream save = new BufferedOutputStream(new FileOutputStream(arr))){
			byte[] num = s.getBytes();
			save.write(num);
			
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
