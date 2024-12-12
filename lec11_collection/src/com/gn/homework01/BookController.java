package com.gn.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	private List<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		bookList.add(new Book("느리게 나이드는 습관","(정희원), ","인문, ",16200));
		bookList.add(new Book("코스모스","(칼 세이건), ","자연과학, ",17910));
		bookList.add(new Book("나에게	들려주는 예쁜 말","(김종원), ","어린이 ",15610));
		bookList.add(new Book("혼자 공부하는 자바","(신용권), ","기타 ",25240));
		
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	public List<Book> selectList(){
		return bookList;
	}
	public List<Book> searchBook(String keyword){
		List<Book>selectList = new ArrayList<Book>();
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				selectList.add(bookList.get(i));
			}
			
		}
		return selectList;
	}
	public Book deleteBook(String title, String author) {
		// 1. 삭제된 도서를 담을 객체(Book removeBook) 선언 및 null 할당
		Book removeBook = null;
		// 2. 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		for(int i = 0 ; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title)
				&&bookList.get(i).getAuthor().equals(author)) {
				// 3. 삭제할 도서가 있는 경우 해당 도서를 removeBook에 대입
				removeBook = bookList.get(i);
				bookList.remove(i);
				break;
			}	
		}
        // 4. removeBook 객체 반환
		return removeBook;
	
			
		
	}
	public int  ascBook() {
	    // Collections.sort와 Comparable활용
	    // 책 이름 기준으로 오름차순 정렬 후 1 반환
		try {
			Collections.sort (bookList);
				return 1;
			}catch(Exception e) {
				return-1;
			}
			
		
		
		
	}
	
	
	
	
	
	
}
