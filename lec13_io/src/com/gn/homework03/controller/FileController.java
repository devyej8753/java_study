package com.gn.homework03.controller;

import com.gn.homework03.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	
	public boolean checkName(String file) {
		fd.checkName(file);
		
		
		return false;
	}
	public void fileSave(String file, StringBuilder sb) {
		
	}
	
	public StringBuilder fileOpen(String file) {
		return null;
	}
	public void fileEdit(String file, StringBuilder sb) {
		
	}
	
	

}
