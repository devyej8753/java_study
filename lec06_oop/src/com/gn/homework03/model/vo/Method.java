package com.gn.homework03.model.vo;

public class Method {
	// 메소드(1)
	public String Porson (String name, String kg) {
		return name+kg;
	}
	// 메소드 (2)
	public int num (int num1, int num2) {
		int total = 0;
		if(num1<num2) {
			System.out.println("계산할 수 없습니다.");
		}else {
			total = num1*num2;
		}
		return total;
	}
	// 메소드(3)
	public boolean name (String na, String me) {
		boolean sum = false;
		if(na.equals(me)) {
			sum = true;
		}
		return sum;
	}
	

}
