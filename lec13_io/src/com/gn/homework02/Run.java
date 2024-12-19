package com.gn.homework02;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		String result = "";
		
		long before1 = System.nanoTime();
		p.method1(result);
		long after1 = System.nanoTime();
		long result1 = after1-before1;
		System.out.println(result1/1000000.0+"초");
		
		long before2 = System.nanoTime();
		p.method2(result);
		long after2 = System.nanoTime();
		long result2 = after2-before2;
		System.out.println(result2/1000000.0+"초");
	}

}
