package com.gn.Practice;

public class Practice01 {

	public static void main(String[] args) {
		// 철수는 친구들의 이름을 배열에 넣고 싶어졌어요.
		// 친구들 이름이 아래와 같다고 할때,
		// 친구들의 이름을 담고 있는 배열 friends를 구성하세요.
		// 박지영, 김태우, 이지훈, 최유진, 정승호
		// 인덱스, 선언+초기화
		
		String[] friends = new String[] {"박지영","김태우","이지훈","최유진","정승호"};
		String[] friends1 = {"박지영","김태우","이지훈","최유진","정승호"};
		String[] friends2 = new String[5];
		friends2[0] ="박지영";
		friends2[1] ="김태우";
		friends2[2] ="이지훈";
		friends2[3] ="최유진";
		friends2[4] ="정승호";
		
		for(int i = 0 ; i <friends.length ; i++) {
			if((i+1) % 2 != 0)  {
				System.out.println((i+1)+":"+friends[i]);
			}

			
		}
		

	}

}
