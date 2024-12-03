package com.gn.homework.dimensional;

public class Practice {
	public void practice01() {
		int[] su = {152, 180, 165, 158, 171};
		for(int i = 0 ; i < su.length  ; i++) {
			
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
				if(num ==su.length) {
					continue;
			}
				System.out.print(",");
		}
	}

}
