package com.gn.study.model.vo;

public class User {
	// throw 강제로 오류발생 시킬때사용
	public void checkAge(int age) {
		if(age < 15) {
			throw new  IllegalArgumentException("15세 이상이어야 합니다");
		}
		System.out.println("나이가 확인되었습니다");
	}
	// throws
	public void nameLength(String name) throws NullPointerException {
		System.out.println(name.length()+"걔");
	}
}
