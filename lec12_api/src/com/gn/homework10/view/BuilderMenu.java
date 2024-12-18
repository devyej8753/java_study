package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.TokenController.BuilderController;

public class BuilderMenu {
	Scanner sc = new Scanner(System.in);
	BuilderController bc = new BuilderController();
	
	public void mainMenu() {
		for(int i = 0 ; ; i++) {
			System.out.println("메뉴 번호를 입력해주세요 : ");
			System.out.println("1. 지정 문자열 사용 ");
			System.out.println("2. 입력 문자열 사용 ");
			System.out.println("3. 프로그램 끝내기 ");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : builderMenu();break;
			case 2 : inputMenu();break;
			case 3 : System.out.println("프로그램을 종료합니다.");
			sc.close();
			return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	public void builderMenu() {
		String str = "J a v a P r o g r a m ";
		// BuilderController()의 afterReplace() 반환값 활용
		bc.afterReplace(str);
		// 다음의 3가지 출력
		// 1. 띄어쓰기 제거 처리 후 글자
		System.out.println("띄어쓰기 제거 처리 후 글자 : "+str);
		// 2. 띄어쓰기 제거 처리 후 글자 개수
		System.out.println("띄어쓰기 제거 처리 후 글자 개수 : "+str.length());
		// 3. 결과를 모두 대문자로 변환 한 것
		System.out.println("결과를 모두 대문자로 변환 한 것 : "+str.toUpperCase());
	}
	public void inputMenu() {
		System.out.print("문자열 입력 :");
		String str = sc.next();
		System.out.println(bc.firstCap(str));
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		System.out.println(bc.findChar(str, c));
	}

}
