package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		
		Practice p = new Practice();
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		
		long before1 = System.nanoTime();
		p.method1(song);
		long after1 =System.nanoTime();
		long result1 = after1-before1;
		System.out.println(result1/100000000.0+"초");
		p.method2(song);
		
		long before2 = System.nanoTime();
		p.method2(song);
		long after2 =System.nanoTime();
		long result2 = after2-before2;
		System.out.println(result2/100000000.0+"초");
		
		
		
		
	}
}
