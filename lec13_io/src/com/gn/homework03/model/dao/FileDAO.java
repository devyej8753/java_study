package com.gn.homework03.model.dao;

import java.io.*;

public class FileDAO {
	
	String total = new String("C:\\homework3");
	
	public boolean checkName(String file) {
		File dir = new File(total);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File checkName = new File(dir,file);
		
		
		
		return checkName.exists();
	}
	public void fileSave(String file, String s) {
		File savefile = new File(total,file);
		
		try(FileWriter save = new FileWriter(savefile)) {
			save.write(s);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public StringBuilder fileOpen(String file) {
		File openFile = new File(total,file);
		StringBuilder sb = new StringBuilder();
		try(FileReader br = new FileReader(openFile)){
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
		File Edit = new File(total,file);
		try(FileOutputStream fos = new FileOutputStream(Edit,true)){
				String str = s;
				byte[] b = str.getBytes();
				fos.write(b);
				fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

	