package com.gn.homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner(System.in);
		        
        System.out.print("단어를 입력하세요: ");
        String name = sc.next();
		        
        String[] arr = sentence.split(" ");
		       
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i].equals(name)) {
        		result = true;
        		if (i == arr.length - 1) {
        			System.out.println("마지막 단어입니다.");
        		} else {
        			System.out.println(name + " 다음 단어: " + arr[i + 1]);
        		}
        		break;
        	}
        }
        if (!result) {
        	System.out.println("존재하지 않는 단어입니다.");
        }
        sc.close();
	}
}
//		String sentence = "the quick brown fox jumps over the lazy dog";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String[] arr = new String[3];
//		for(int i = 0; i<arr.length ; i++) {
//			System.out.print("단어를 입력하세요"+(i+1)+":");
//			arr[i] = sc.nextLine();
//		}
//		String result = arr[0];
//		for(int i = 1 ; i < arr.length ; i++) {
//			if(result.length()< arr[i].length()) {
//				result = arr[i];
//			}else if(result.length() == arr[i].length()) {
//				if(result.compareTo(arr[i])<0) {
//					result = arr[i];
//				}
//			}
//		}
//		System.out.println(result.concat(result));
//		
//
//		
//	}
//
//}
