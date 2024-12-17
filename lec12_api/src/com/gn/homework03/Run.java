package com.gn.homework03;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	- 사용자로부터 이메일 주소를 입력 받으세요.
		String email = sc.nextLine();
//	- 입력받은 이메일에 앞뒤 공백을 제거합니다.
		email = email.trim();
//	- 이메일이 @goodee.co.kr로 끝나는지 확인합니다.
		String gd = "@goodee.co.kr";
		int idx = email.lastIndexOf('@');
//	- 만일 @뒤에 글자가 위와 다를 경우 “유효하지 않은 이메일입니다.”를 출력합니다.
		if(idx == -1 || !email.substring(idx).equals(gd)) {
			System.out.println("유효하지 않은 이메일입니다.");
//	- 유효한 이메일이라면, 아이디(@앞부분)을 추출하면 대문자로 변환한 뒤 출력하세요.
		}else {
			String id = email.substring(0, idx).toUpperCase();
			System.out.println("아이디 : "+id);
		}
		
		
		
		
		
	}

}
