package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.information();
		Book myBook1 = new Book("홍길동전","허균",5000);
		myBook1.information();
		Book myBook2 = new Book("채소 과일 레시피","박경희","터치아트",19300,0.1);
		myBook2.information();
	}
		

}
