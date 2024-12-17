package com.gn.study.controller;

public class StringRun {
	
	public static void main(String[] args) {
		// 1. 리터럴 -> ""
		// 값이 같으면 hashCode 동일, == 비교 연산자 
		String str = "Hello";
		System.out.println("Hello(1) : "+System.identityHashCode(str));
//		str += "World";
		System.out.println(System.identityHashCode(str));
		
		String str1 ="Hello";
		System.out.println("Hello(2) : "+System.identityHashCode(str1));
		if(str == str1) {
			System.out.println("같다!!");
		}
		// 2. new 연산자 -> 객체
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
		
		// 3. equals()
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : "+str.length());
		// 5. charAt() 
		System.out.println("charAt(i) : "+str2.charAt(0));
		// 6. toCharArray() 
		char[] arr = str2.toCharArray();
		System.out.println((int)'a'+"~"+(int)'z');
		System.out.println((int)'A'+"~"+(int)'Z');
		// 7. contains()
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo() => Hello
		System.out.println("compareTo() : "+str.compareTo("ZZZ"));
		// 9. concat -> 원본값 수정 불가능
		String test = "우리는";
		test = test.concat("할수있다.");
		System.out.println(test);
		
		// 10. indexOf
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12"));
		
		// 11. split
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		String b ="e.f.g.h";
		String[] arrB = b.split("\\.");
		
		String name = "김 철 수";
		String[] nameArr = name.split(" ");
		for(String n : nameArr) {
			System.out.println(n);
		}
		
		// 문자열 바꾸기
		String ide = "eclipse";
		ide = ide.replace("e", "a");
		System.out.println(ide);
		String id = "김 철 수";
		id = id.replace(" ","");
		System.out.println(id);
		
		// 비어있는지 확인
		String empty1 = "";
		String empty2 = " ";
		System.out.println("(1) : "+empty1.isBlank());
		System.out.println("(2) : "+empty2.isBlank());
		
		System.out.println("(3) : "+empty1.isEmpty());
		System.out.println("(4) : "+empty2.isEmpty());
		
		System.out.println(empty1.length()==0);
		empty2 = empty2.replace(" ","");
		System.out.println(empty2.length()==0);
		
		String empty3 = " 안 녕 ";
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		
		System.out.println("=== join ===");
		String[] students = {"철수","영희","길동"};
		String allStudents = String.join("-", students);
		System.out.println(allStudents);
		
		System.out.println("=== 문자열 자르기 ===");
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0,5));
		System.out.println(cutTest.substring(3,4));
		
		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".")+1);
		String filename = file.substring(0,file.lastIndexOf("."));
		System.out.println(ex+" : "+filename);
		
		System.out.println("=== 대문자,소문자로 바꾸기 ===");
		String original = "Hello World";
		String upperCase = original.toUpperCase();
		String lowerCase = original.toLowerCase();
		System.out.println("대문자 변환: "+ upperCase);
		System.out.println("소문자 변환: "+ lowerCase);
		
		// valueOf
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr+2.1);
		
		// StringBuilder  문자열 추가
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("world!!");
		System.out.println(sb);
		
		// insert  원하는 위치에 문자열 추가
		sb.insert(5, " Java ");
		System.out.println(sb);
		
		// delete 문자열 삭제
		sb.delete(11, 16+1);
		System.out.println(sb);
		
		// deleteCharAt(인덱스)
		int idx = sb.indexOf("!");
		sb.deleteCharAt(idx);
		System.out.println(sb);
		
		// reverse 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
