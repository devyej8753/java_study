package com.gn.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		int width = 1;
		int height = 1;
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int calculateRound() {
		int su1 = 0;
		su1 = (width*2)+(height*2);
		return su1;
	}
	public int calculateArea() {
		int su1 = 0;
		 su1 = width*height;
		return su1;
	}
	public void printinfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레 ");
		System.out.println(calculateRound()+"cm");
		System.out.println("2. 사격형의 넓이");
		System.out.println(calculateArea()+"cm");

	}
	

}
