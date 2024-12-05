package com.gn.study.capsule;

import com.gn.study.capsule.closed.Account2;
import com.gn.study.capsule.open.Account1;

public class Run {

	public static void main(String[] args) {
		Student s = new Student();
		
//		System.out.println(s.studentNo);
//		setter 사용법
		s.setStudenNo(15);
		
		
		
//		getter 사용법
		int num = s.getStudenNo();
		System.out.println(num);
		
		System.out.println(s.getStudenNo());
		
		
		System.out.println("=== Account1 ===");
		// 캡슐화(X)
		Account1 a1 = new Account1("김철수",2000);
		a1.balance -= 5000;
		System.out.println(a1.balance);
		
		System.out.println("=== Account2 ===");
		Account2 a2 = new Account2("김철수",2000);
//		a2.Balance -= 5000;
//		System.out.println(a2.balance);
		
		a2.setBalance(a2.getBalance()-5000);
		System.out.println(a2.getBalance());
		

	}

}
