package com.gn.homework.dimensional;

public class Practice {
	public void practice01() {
		int[] su = {152, 180, 165, 158, 171};
		for(int i = 0 ; i < su.length-1  ; i++) {
			
			for(int j = i + 1 ; j<su.length ; j++) {
				
				if(su[i]>su[j]) {
					int tem = su [i];
					su[i] = su[j];
					su[j] = tem;
				}
			}
		}
		int num = 0;
		for(int d : su) {
			System.out.print(d);
			num++;
				if(num ==su.length) {
					continue;
			}
				System.out.print(",");
		}
	}
	public void practice02() {
		
	}
	public void practice03() {
		
	}
	public void practice04() {
		
	}
	public void practice05() {
		
	}
	public void practice06() {
		
	}
}
