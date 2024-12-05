package com.gn.practice07.run;

import com.gn.practice07.model.vo.Supplement;

public class Run {

	public static void main(String[] args) {
		Supplement[] arr1 = new Supplement[4];
		
		Supplement s1 = new Supplement("유산균, ",1,18000);
		arr1[0] = s1;
		arr1[1] = new Supplement("비타민B, ",1,15000);
		arr1[2] = new Supplement("루테인, ",2,20000);
		arr1[3] = new Supplement("비타민D, ",1,12000);
		
		for(Supplement s : arr1) {
			s.information();
		}
		
		

	}

}
