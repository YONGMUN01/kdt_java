package report;
// 과제1
// 1) 한 곡당 금액도 입력받기
//금액입력 : 1000
//곡 당 가격 입력 : 300 
//[출력]
//3곡을 부를 수 있으며 잔돈은 100원입니다
//
//2) 잔돈이 부족할 경우 안내하기
//금액입력 : 100
//곡 당 가격 입력 : 
//[출력]
//입력한 금액은 100원입니다. 곡당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다

import java.util.Scanner;	// 스캐너 import

public class SingTask01 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		// 로직구성
		// 1) 입력클래스 선언, import
		Scanner sc = new Scanner(System.in);	// 입력클래스 선언
		
		// 2) 금액입력 메시지 출력, 금액 변수 선언 및 입력받은 값 대입
		System.out.print("금액 입력 : ");	// "금액 입력 : " 출력
		int money = sc.nextInt();	// 금액 변수 선언 후 입력 값 대입
		
		// 3) 곡 당 가격 메시지 출력, 곡 당 가격 변수 선언 및 입력받은 값 대입
		System.out.print("곡 당 가격 입력 : ");	// "곡 당 가격 입력 : " 출력
		int price = sc.nextInt();	// 가격 변수 선언 및 입력받은 값 대입
		
		// 4) if문 금액 >= 가격 일 경우 메시지, 잔돈 = 금액 % 가격
		if(money > price) {	// if문 중괄호 시작
			System.out.println((money / price) + "곡을 부를 수 있으며, 잔돈은 " + (money % price) + "원입니다.");	// "00곡 부를 수 있으며, 잔돈은 00원입니다." 출력
		}	// if문 중괄호 끝
		
		// 5) else문 메시지 출력, 부족한 가격 = 가격 - 금액
		else {	// else문 중괄호 시작
			System.out.println("입력한 금액은 " + money + "원입니다. \n곡당 가격은 " + price + "원으로 " + (price - money) + "원이 부족하여 노래를 부를 수 없습니다.");
				// "입력한 금액은 000원입니다
				// 곡당 가격은 000원으로 000원이 부족하여 노래를 부를 수 없습니다." 출력
		}	// else문 중괄호 끝
		
		// 6) Scanner 종료
		sc.close();	// Scanner 종료
		
	}
}
