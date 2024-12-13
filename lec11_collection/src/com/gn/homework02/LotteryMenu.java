package com.gn.homework02;

import java.util.*;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		for(int i = 0 ; ; i++) {
		System.out.println("==== 로또 번호 추첨 ====");
		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 추첨 대상 목록 조회");
		System.out.println("4. 당첨 대상 구성");
		System.out.println("5. 정렬된 당첨 대상 확인");
		System.out.println("6. 당첨 대상 검색");
		System.out.println("9. 종료.");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : insertObject();break;
		case 2 : deleteObject();break;
		case 3 : searchObject();break;
		case 4 : winObject();break;
		case 5 : sortedWinObject();break;
		case 6 : searchWinner();break;
		case 9 : System.out.println("프로그램 종료.");
		sc.close();
		return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
		
		}
	}
	public void	insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		int check = 0;
		while(check != num) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name,phone);
			if(lc.insertObject(l)) {
				check++;
			}else {
				System.out.println("중복된 대상입니다. 다시 입력해주세요.");
			}
		}
		System.out.println(num+"명 추가 완료되었습니다.");
		
	}
	public void deleteObject() {}
	public void searchObject() {}
	public void winObject() {}
	public void sortedWinObject() {}
	public void searchWinner() {}
	
	
	

}
