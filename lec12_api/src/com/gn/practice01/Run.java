package com.gn.practice01;

public class Run {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
//		크기가 1,000,000인 정수 배열을 생성하세요.
		int[] src = new int[1000000];
		
//		그 다음 랜덤값(1~100사이)으로 해당 배열을 초기화하세요.
		for(int i = 0 ; i <src.length ; i++) {
			int random =(int)(Math.random()*100)+1;
			src[i] = random;
		}
//		System.arraycopy()를 사용하여 이 배열의 절반을 새로운 배열로 복사하세요.
		int[] dst = new int[src.length/2];
		System.arraycopy(src, 0, dst, 0, src.length/2);
//		복사된 배열의 값을 출력예시와 같은 모양으로 출력하세요.
		for(int j = 0 ; j < dst.length ; j++) {
			if(j%10==9) {
				System.out.println(dst[j]);
			}else {
				System.out.print(dst[j]+", ");
			}
		}
//		System.curentTimeMillis()를 사용하여 기능 구현에 소요되는 시간을 측정하여 출력하세요
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간: "+(after-before)+"ms");
				
				
				
				
		
				
				
	}

}
