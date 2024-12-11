package com.gn.homework01;

import java.util.*;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		for(int i = 0 ; ; i++) {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택: ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : insertBook();break;
		case 2 : selectList();break;
		case 3 : searchBook();break;
		case 4 : deleteBook();break;
		case 5 : ascBook();break;
		case 9 : System.out.println("프로그램을 종료합니다.");
		sc.close();
		return;
		default:
			System.out.println("잘못 입력하였습니다. 다시입력해주세요.");
		}
		
		}	
		
	}
	public void insertBook() {
		System.out.println("=== 도서 등록 ===");
		
		System.out.print("도서명 : ");
		String title = sc.next();
		sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타) :");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		String category1 = " ";
		if(category ==1) {
			category1 = "인문";
		}else if (category==2) {
			category1 = "자연과학";
		}else if (category==3) {
			category1 = "어린이";
		}else {
			category1 = "기타";
		}
		Book book = new Book(title, author, category1, price);
		System.out.println(book);
		bc.insertBook(new Book(title, author, category1, price));
		
		
	}
	public void	selectList() {
		System.out.println("=== 전체 조회 ===");
		BookController b = new BookController();
		List<Book> arr = b.selectList();
		if(arr.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(Book a : arr) {
				System.out.println(a);
				
			}
		}
		
		
		
		
		
		
		
		
		
	}
	public void	searchBook() {}
	public void	deleteBook() {}
	public void ascBook() {}
	
	
	
}
