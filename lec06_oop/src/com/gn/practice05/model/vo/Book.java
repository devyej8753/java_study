package com.gn.practice05.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
		
		
	}
	
	public Book(String title,String publisher,String author,
			int price,double discountRate) {
		this.title =title;
		this.publisher =publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public void information() {
		System.out.println("==="+title+"===");
		System.out.println("저자 :"+author);
		System.out.println("출판사 :"+publisher);
		System.out.println("가격 :"+price+"원");
		System.out.println("할인율 :"+discountRate);
		
	
	}

	
	

}
