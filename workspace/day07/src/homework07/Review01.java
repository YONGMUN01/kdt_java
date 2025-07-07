package homework07;

import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		// 입력클래스 선언 import
		Scanner sc = new Scanner(System.in);
		
		// 1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
		// 로직 구성
		// 1) 정수형 변수 선언 초기화
		// 2) 입력메시지 출력
		// 3) 변수에 입력받은 값 대임
		// 4) 삼항연산자를 통해 출력
		int number = 0;
		
		System.out.print("한 개의 정수를 입력해주세요. : ");
		number = sc.nextInt();
		System.out.printf("입력하신 숫자는 %s입니다.", (number % 2 == 0) ? "짝수" : "홀수");
		
		// 2. 한 개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		// 로직 구성
		// 1) 정수형 변수 선언 및 초기화
		// 2) 입력메시지 출력
		// 3) 변수에 입력받은 값 대입
		// 4) if-else if-else 순서대로 양수 음수 0으로 구분
		//	4-1) 각 중괄호 안에 출력메시지 작성
		int num = 0;
		
		System.out.print("한 개의 정수를 입력해주세요. : ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("입력하신 " + num + "은 양수입니다.");
		} else if(num < 0) {
			System.out.println("입력하신 " + num + "은 음수입니다.");			
		} else {
			System.out.println("입력하신 " + num + "은 0입니다.");						
		}
		
		
		// 3. 나이를 입력받아서 다음 기준으로 출력하기
		// 로직 구성
		// 1) 정수형 변수 선언 및 초기화
		// 2) 입력메시지 출력
		// 3) 변수에 입력받은 값 대입
		// 4) if문 3개 작성 후 0-12, 13-19, 20~ 별로 출력메시지 작성
		int age = 0;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 0 && age <= 12) {
			System.out.println("현재 나이는 " + age + "이고 어린이입니다.");
		}
		if(age >= 13 && age <= 19) {
			System.out.println("현재 나이는 " + age + "이고 청소년입니다.");
		}
		if(age >= 20) {
			System.out.println("현재 나이는 " + age + "이고 성인입니다.");						
		}
		
		// 4. 세 개의 정수를 입력받아서 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
		// 	  단, 세 개의 정수는 모두 다른 숫자이어야한다(중복값 x)
		// 로직 구성
		// 1) 정수형 변수 3개 , 정수형 변수 1개 선언후 초기화
		// 2) 입력메시지 출력
		// 3) 변수에 입력값 대입
		// 4) while문 사용
		//		4-1) if문) num1보다 num2가 크면 num1값 blank에 대입, num2값 num1에 대입, blank값 num2에 대입
		//		4-2) if문) num2보다 num3가 크면 num2값 blank에 대입, num3값 num2에 대입, blank값 num3에 대입
		//		4-3) if문) num1 > num2 && num2 > num3이 true 면 while문 break;
		// 5) 결과값 출력
		int num1 = 0, num2 = 0, num3 = 0, blank = 0;
		
		
		System.out.print("숫자 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		while(true) {
			if (num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.println("중복된 숫자는 안됩니다.");
				continue;
			} else {
				break;
			}
		}
		
			
		while(true) {
			if(num1 < num2) {
				blank = num1;
				num1 = num2;
				num2 = blank;
			}
			if(num2 < num3) {
				blank = num2;
				num2 = num3;
				num3 = blank;
			}
			if(num1 > num2 && num2 > num3) {
				break;
			}
		}
		System.out.printf("정렬된 숫자 : %d %d %d", num1, num2, num3);
		
		// 5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		// 로직 구성
		// 1) 문자열 변수 선언 put
		// 2) while문 (true)
		//		2-1) 입력메시지 출력
		//		2-2) put에 nextLint() 입력값 대입
		//		2-3) if문(put.equals("X")
		//			break;
		//		2-4) syso(put);
		// 3) 종료메시지 출력
		sc.nextLine();
		
		String put;
		
		while(true) {
			System.out.print("문구를 입력해주세요(\"X\"를 누를 시 종료) : ");
			put = sc.nextLine();
			if(put.equals("X")) {
				break;
			}
			System.out.println(put);
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		// ATM 메뉴에서 입금, 출금, 잔액조회 하기
		// [조건]
		// 초기 잔액은 10000원으로 설정
		// 메뉴 선택에 따라 작업 수행
		// 종료시 프로그램 종료
		// 숫자(번호)로 입력받기
		// 로직 입력
		// 1) 정수형 변수 2개 선언(초기잔액, 메뉴), 문자열 변수 선언 후 초기화
		// 2) while
		// 		3) syso(문자열 변수)
		//		3-1) 입력메시지 출력
		//		3-2) 메뉴에 입력받은 값 대입
		//		3-3) switch(메뉴변수)
		//			case 1: 잔액조회
		//			case 2: 입금
		//			case 3: 출금
		//			case 4: 종료기능
		//			default: 다시 선택하세요 출력 continue
//		int money = 10000, menu = 0;
//		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : "
//				+ "\n1. 잔액조회"
//				+ "\n2. 입금"
//				+ "\n3. 출금"
//				+ "\n4. 종료"	// 종료기능은 추가
//				+ "\n선택 : ";
//		while(menu != 4) {
//			System.out.print(msg);
//			menu = sc.nextInt();
//			
//			switch(menu) {
//			case 1:
//				System.out.println("김용문님의 현재 잔액은 : " + money);
//				System.out.println("기본화면으로 돌아갑니다.");
//				break;
//			case 2:
//				System.out.println("000님의 계좌로 5000원 입금하겠습니다.");
//				System.out.println("기본화면으로 돌아갑니다.");
//				break;
//			case 3:
//				System.out.println("김용문님의 계좌에서 10000원을 출금합니다.");
//				System.out.println("기본화면으로 돌아갑니다.");
//				break;
//			case 4:
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			default:
//				System.out.println("다시 선택해주세요.");
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		// 스캐너 종료
		sc.close();
		
	}
}
