package com.gn.Practice01;

public class Practice03 {

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1,0,1,0,0,1};
		int sum = 0;
		for(int su : numbers) {
			sum += su;
		}
		System.out.println("출석한 학생의 수 :"+ sum);
		System.out.println("결석한 학생의 수 :"+(numbers.length-sum));
		
		
	}

}
