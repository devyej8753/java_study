package com.gn.homework03.controller;

import com.gn.homework03.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	
	public boolean checkName(String file) {
		fd.checkName(file);
		return fd.checkName(file);
	}
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
		fd.fileOpen(file);
		return fd.fileOpen(file);
	}
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
	
	

}
