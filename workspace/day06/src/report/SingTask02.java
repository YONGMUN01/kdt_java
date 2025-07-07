package report;

import java.util.Scanner;	// 입력클래스 import

// 과제2
// 3) 남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
// 금액입력 : 
// [출력]
// 5곡을 부를 수 있으며 잔돈은 0원입니다
// 음료(1잔만가능) 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원입니다.
public class SingTask02 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// 1) 입력클래스 선언, import
		Scanner sc = new Scanner(System.in);	// 입력클래스 선언
		
		// 2) 곡 금액, 음료 금액, 금액 변수 선언 후 초기화
		int price = 200, drink = 100, money = 0;	// 곡, 음료, 금액 변수 선언 후 초기화
		
		// 3) 금액입력 메시지 출력 후 금액 변수에 입력받는 값 대입
		System.out.print("금액 입력 : ");	// "금액 입력 : " 출력
		money = sc.nextInt();	// 금액 변수에 입력받은 값 대입
		
		// 4) 결과메시지 출력
		
		System.out.print("음료를 주문하시겠습니까(y/n)? ");		//	"음료를 주문하시겠습니까(y/n)? " 출력
		char yn = sc.next().charAt(0);	// 음료 구매여부 변수 선언 후 입력받은 값 대입
		if(yn == 'n') {	// if문 중괄호 시작
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d입니다. \n", money / price, money % price);	// "00곡 부를 수 있으며 잔돈은 00원입니다." 출력
		}else if(yn == 'y') {	// if 중괄호 끝, else if 중괄호 시작
			System.out.printf("음료를 주문하신다면 %d곡을 부를 수 있으며 잔돈은 %d원입니다.", (money - drink) / price, (money - drink) % price);
				// "음료를 주문하신다면 00곡을 부를 수 있으며 잔돈은 00원입니다." 출력
		} 	// else if 중괄호 끝
		else {	// else 중괄호 시작
			System.out.println("잘못된값을 입력하셨습니다.");	// "잘못된값을 입력하셨습니다." 출력
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다. \n", money / price, money % price);		// "00곡을 부를 수 있으며 잔돈은 00원입니다." 출력
		}	// else 중괄호 끝
		
		// 5) Scanner 종료
		sc.close();	// Scanner 종료
		
	}	// main 메소드 중괄호 끝
}	// 클래스 중괄호 끝
