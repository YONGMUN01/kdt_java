package oper;

import java.util.Scanner;

// 13번 : 산술연산자 응용
public class OperTesk01 {
	public static void main(String[] args) {
		
		// 코인노래방 프로그램
		// 사용자에게 금액을 입력받고 부를 수 있는 곡 수, 잔 돈을 출력
		// 금액입력 : 1000
		// [출력]
		// 3곡을 부를 수 있으며 잔돈은 100원입니다.
		
		// 1) 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 2) 1곡당 요금 변수 후 300원 초기화, 곡 수 변수1개, 잔돈 변수 1개 선언, 금액 변수 1개 선언
		final int PRICE = 300;
		int count = 0, change = 0, money = 0;
		
		// 3) 금액입력 메시지 출력
		System.out.print("금액입력 : ");

		// 4) 금액 입력받기
		money = sc.nextInt();
		
		// 5) 곡 수 = 금액 / 1곡당 요금
		count = money / PRICE;
		
		// 6) 잔돈 = 금액 % 1곡당 요금
		change = money % PRICE;
		
		// 7) 출력
		System.out.printf("\n[출력]\n%d곡을 부를 수 있으며 잔돈은 %d원입니다.", count, change);
		
		// 8) 입력클래스 닫기
		sc.close();
		
	} 
}

// 로직 구성
// 입력클래스, 입력클래스 import, 정수형 변수 금액입력, 곡수, 잔돈, 산술연산자(/, %), 출력메소드
// 1) 입력클래스 import
// 2) 금액을 입력하세요 메시지 출력
// 3) 정수형 변수1 = 입력메소드(nextInt())
// 4) 상수 = 300
// 5) 정수형 변수2 = 변수1 / 상수명
// 6) 정수형 변수3 = 변수1 % 상수명
// 7) 출력
// 8) Scanner 해제

// Scanner sc = new Scanner(System.in);
// System.out.println("금액을 입력하세요 : ");
// int money = sc.nextInt();
// // System.out.println(money);
// final int PRICE = 300;
// int song = money / price;
// int change = money % price;
// System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다.");
// sc.close();
