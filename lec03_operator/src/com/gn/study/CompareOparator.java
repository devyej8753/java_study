package com.gn.study;
// 비교 연산자
public class CompareOparator {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		// 1. 등호
		System.out.println(num1==num2);//false
		boolean same = num1==num2;
		
		// 2. 부등호
		boolean diff = num1!=num2;
		
		// 3. 크다, 작다
		boolean big = num1 > num2;
		boolean smail = num1<num2;
		
		// 4. 크거나 같다, 작거나 같다.
		boolean bigSame = num1>=num2;
		
		// 5. char와 비교 연산자
		char c1 ='a';
		char c2 ='A';
		System.out.println(c1 < c2); //false
		System.out.println((int)c1+" < "+(int)c2); //위에 코드 확인하는법
		
		// 6. equals
		String str1 = "apple";
		String str3 = new String("apple");
		boolean bool = str1.equals(str3); //두개 같은표현
		bool = str3.equals(str1); // 두개 같은표현
		
		// 7. 논리 연산자
		int a = 6;
		int b = 5;
		int c = 7;
		
		// b < a < c ?? (한번에 안됨)
		// b < a && a < c ??
		
		// (1) AND : 6은 5보다 크고, 그리고 6은 7보다 큰가요?
		boolean andBool = a > b && a > c;
		System.out.println(andBool);//false
		
		// (2) OR : 6은 5보다 크고, 또는 6은 7보다 큰가요?
		boolean orBool = a > b || a > c;
		System.out.println(orBool);//true
		
		// 8. 논리 부정 연산자
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
		// 논리 연산자(&&, ||) 와 함께 사용
		boolean test1 = 3 < 5; // true
		boolean test2 = 6 < 5; // false
		
		// true && false -> false -> true
		System.out.println(!(test1 && test2)); 
		
		// true && !false -> true && true -> true
		System.out.println(test1 && !test2);
		
		
		
		
		
		
		
	}

}
