package com.gn.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		사용자로부터 세 개의 문자열을 입력 받습니다.
		Scanner sc = new Scanner(System.in);
		String[] set = new String[3];
		for(int i = 0; i<set.length ; i++) {
			System.out.print("문자열("+(i+1)+")"+" : ");
			set[i] = sc.nextLine();
		}
//		System.out.print("문자열(1) : ");
//		String str1 = sc.nextLine();
//		System.out.print("문자열(2) : ");
//		String str2 = sc.nextLine();
//		System.out.print("문자열(3) : ");
//		String str3 = sc.nextLine();
//		
		
//		세개의 문자열의 길이를 비교하여 가장 긴 문자열을 2번 연결한 다음 출력하세요.
		String result = set[0];
		for(int i = 0; i < set.length ; i++) {
			if(result.length() < set[i].length()) {
				result = set[i];
			}else if(result.length() == set[i].length()) {
				if(result.compareTo(set[i])>0) {
					result = set[i];
				}
			}
		}
		System.out.println(result.concat(result));
		
//		if(str1.length() < str2.length()) {
//			result = str2;
//		}else if(str1.length() > str2.length()) {
//			result = str1;
//		}else {
//			if(str1.compareTo(str2) < 0) {
//				result =str2;
//			}else {
//				result = str1;
//			}
//		}
//		if(result.length() < str3.length()) {
//			result = str3;
//		}
//		
//		
//		List<String> list = new ArrayList<String>();
//		list.add(str1);
//		list.add(str2);
//		list.add(str3);
//		
//		for(int i = 0; i < list.size() ; i++) {
//			for(int j = 0 ; j < list.size(); j++) {
//				if(list.indexOf(i)>list.indexOf(j)) {
//					temp = list.indexOf(i);
//					System.out.println(temp);
//				}
//			}
//		}
//		System.out.println(list);
//		Collections.sort(list, Collections.reverseOrder());
		
//		if((str2.length()>str1.length() || str2.length() == str1.length() && str1.compareTo(str2)>0)) {
//			result = str2;
//		}
//		if((str3.length()>str1.length() || str3.length() == str1.length() && str1.compareTo(str3)>0)) {
//			result = str3;
//		}
//		System.out.println(result+result);
		
	}

}
