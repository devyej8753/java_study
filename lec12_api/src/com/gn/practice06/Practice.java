package com.gn.practice06;

public class Practice {
	
	public String test() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
//		1단계 : 문장 끝에 느낌표 !를 추가하세요.
		sb.append("!");
//		System.out.println("1단계 : "+sb);
		
//		2단계 : 문장 앞에 <<를 삽입하세요.
		sb.insert(0, "<<");
//		System.out.println("2단계 : "+sb);
		
//		3단계 : 가운데 단어를 제거하세요.
//		sb.delete(9, 11+1);
		int idx1 = sb.indexOf(" ");
		int idx2 = sb.lastIndexOf(" ");
//		System.out.println(idx1 + " : "+idx2);
//		System.out.println("3단계 : "+sb);
		sb.delete(idx1, idx2);
		
//		4단계 : 마지막으로 모든 문자를 뒤집은 결과를 리턴하세요
		sb.reverse();
//		System.out.println(sb);
//		System.out.println("4단계 : "+sb);
		return sb.toString();
		
	}
	
	
	
	
}
