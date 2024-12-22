package com.gn.homework03.model.dao;

import java.io.*;

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
		try(FileWriter save = new FileWriter(file)) {
			save.write(s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(FileReader br = new FileReader(file)){
			int value;
			while((value = br.read()) != -1) {
				sb.append((char)value);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sb;	
			
	}
	public void fileEdit(String file, String s) {
		try(FileOutputStream fos = new FileOutputStream(file,true)){
				String str = s;
				byte[] b = str.getBytes();
				fos.write(b);
				fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

	