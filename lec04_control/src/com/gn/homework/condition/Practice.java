package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {

	public void practice01() {
		
		System.out.println("=== 놀이동산 입장료 계산하기 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int num = sc.nextInt();
		String name = new String();
		if(num >= 65) {
			name = "무료";
		}else if (num >= 19) {
			name = "30000원";
		}else if (num >= 13) {
			name = "20000원";
		}else if (num >= 3) {
			name = "10000원";
		} else {
			name ="무료";
		}
		sc.close();
		System.out.println("당신의 놀이동산 요금은 "+ name +"입니다");
		
	 }
	
		
	public void practice02() {
		System.out.println("=== 일기예보 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int num1 = sc.nextInt();
		System.out.print("기온 : ");
		int tem = sc.nextInt();
		if(num1==3||num1==4||num1==5) {
			System.out.println("봄");
			
		}else if(num1==6||num1==7||num1==8) {
			System.out.println("여름");
			if(tem >= 35) {
				System.out.println("폭염 경보");
			}else if(tem >= 33) {
				System.out.println("폭염 주의보");
			}
		}else if(num1==9||num1==10||num1==11) {
			System.out.println("가을");
		}else if(num1==12||num1==1||num1==2) {
			System.out.println("겨울");
			}else if(tem <= -15) {
				System.out.println("한파 경보");
			}else if(tem <= -12) {
				System.out.println("한파 주의보");
		}else {
			sc.close();
			System.out.println("해당된 계절이 없습니다");
		}
	}
			
		
	public void practice03() {
		System.out.println("=== 세개의 정수 비교하기 ===");
			Scanner sc = new Scanner(System.in);
			System.out.print("첫 번째 정수 : ");
			int su =sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int su1 =sc.nextInt();
			System.out.print("세 번째 정수 : ");
			int su2 =sc.nextInt();
			
			int min = su < su1 ? (su < su2 ? su : su2) : (su1 < su2 ? su1 : su2);
			System.out.println("세 수 중에서 가장 작은 수는 "+min+"입니다");
			sc.close();
			
		}
		
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 철수네 공장 ===");
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		
		switch (code) {
			case 400 :
				System.out.println("잘못된 요청입니다.");
				break;
			case 404 :
				System.out.println("요청하신 서비스를 찾을수 없습니다.");
				break;
			case 500 :
				System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
				break;
			case 503 : 
				System.out.println("일시적인 서버 오류가 발생했습니다.");
				break;
			default :
				System.out.println("알 수 없는 오류가 발생하였습니다.");
				break;
		}
		sc.close();
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int su =sc.nextInt();
		
		String msg = "";
		
		if(0<su&&su<=5) {
			if(su==1) {
				msg = "스쿼트 운동 시간입니다.";
			}else if(su==2) {
				msg = "데드리프트 운동 시간입니다.";
			}else if(su==3) {
				msg = "벤치 프레스 운동 시간입니다.";
			}else if(su==4) {
				msg = "풀업 운동 시간입니다.";
			}else if(su==5) {
				msg = "오늘도 수고하셨습니다.";
			}
		}else if(su<=0) {
			msg = "양수만 입력해주세요.";
		} else {
			msg = "목록에 있는 숫자만 입력해주세요.";
		}
		System.out.println(msg);
		sc.close();
			}
		public void practice06() {
			Scanner sc = new Scanner(System.in);
			System.out.println("=== 합격인가? 불합격인가? ===");
			System.out.println("각 과목의 점수를 입력 하세요");
			System.out.print("소프트웨어설계 점수: ");
			int num1 = sc.nextInt();
			System.out.print("소프트웨어개발 점수: ");
			int num2 = sc.nextInt();
			System.out.print("데이터베이스구축 점수: ");
			int num3 = sc.nextInt();
			System.out.print("프로그래밍언어활용 점수: ");
			int num4 = sc.nextInt();
			System.out.print("정보시스템구축관리 점수: ");
			int num5 = sc.nextInt();
			
			int sum = (num1+num2+num3+num4+num5);
			int avg = (sum/5);
			String nu = "";
			if(num1 >=40&&num2>=40&&num3>=40&&num4>=40&&num5>=40) {
				if(avg>=60) {
					System.out.print("합격을 축하합니다!");
				}else {
					System.out.print("평균 점수 60점 미만으로 불합격입니다.");
				}	
				
			}else {
				if(num1<40) {
					nu += "소프트웨어설계 점수 ";
				}
				if(num2<40) {
					nu += "소프트웨어개발 점수 ";
				}
				if(num3<40) {
					nu += "데이터베이스구축 점수 ";
				}
				if(num4<40) {
					nu += "프로그래밍언어활용 점수 ";
				}
				if(num5<40) {
					nu += "정보시스템구축관리 점수 ";
				}
				System.out.println(nu+"과락으로 불합격입니다.");
			}
				sc.close();
			}
			
		}

			
			
			
			


			
		
		







//			}else {
//				if(su == 2) {
//					System.out.println("데드리프트 운동 시간입니다.");
//				}else {
//					if(su ==3 ) {
//						System.out.println("벤치 프레스 운동 시간입니다.");
//					}else {
//						if(su == 4) {
//							System.out.println("풀업 운동 시간입니다.");
//						}else {
//							if(su == 5) {
//								System.out.println("오늘도 수고하셨습니다.");
//							}else {
//								System.out.println("목록에 있는 숫자만 입력해주세요.");
//							}
//		if(su == 1) {
//			System.out.print("스쿼트 운동 시간입니다.");
//		}else if (su == 2) {
//			System.out.print("데드리프트 운동 시간입니다.");
//		}else if (su == 3) {
//			System.out.print("벤치 프레스 운동 시간입니다.");
//		}else if (su == 4) {
//			System.out.print("풀업 운동 시간입니다.");
//		}else if (su == 5) {
//			System.out.print("오늘도 수고하셨습니다");
//		}else {
//			System.out.print("목록에 있는 숫자만 입력해주세요.");
//		}
//		sc.close();