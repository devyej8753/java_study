package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		String allWords = String.join(" ", words);
		System.out.println("문장 : "+allWords);
		
		String a = allWords.substring(5, 6).toUpperCase();
		String b = allWords.substring(17,18).toUpperCase();
		String c = allWords.substring(29,30).toUpperCase();
		
		System.out.println("변환: "+a+b+c);

		
	}

}
