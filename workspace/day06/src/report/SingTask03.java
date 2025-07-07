package report;

import java.util.Scanner;	// 입력클래스 선언

// 과제3
// 클래스 명 : SingTask03
// 4) 총 부른 곡 수에 따른 보너스 곡 지급
// 5곡을 부르면 1곡 추가 제공
public class SingTask03 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// 로직구성
		// 1) 입력클래스 선언, import
		Scanner sc = new Scanner(System.in);	// 입력클래스 선언
		
		// 2) 금액, 요금, 서비스 변수 선언
		int money = 0, price = 0, service = 0;	// 금액, 요금, 서비스 변수 선언 후 초기화
		
		// 3) 금액 메시지 출력, 금액 변수에 입력받은 값 대입
		System.out.print("금액 입력 : ");	// "금액 입력 : " 출력
		money = sc.nextInt();	// 금액 변수에 입력한 값 대입
		
		// 4) 요금 메시지 출력, 요금 변수에 입력받은 값 대입
		System.out.print("곡 당 가격 입력 : ");		// "곡 당 가격 입력 : " 출력
		price = sc.nextInt();	// 요금 변수에 입력한 값 대입
		
		// 5) 서비스 = 금액 / (요금 * 5)
		service = money / (price * 5);	// 서비스 변수에 몇곡 서비스인지 대입
		
		// 6) 결과 메시지 출력
		System.out.println("총 " + (money / price) + "곡 부르셨습니다.");		// "총 00곡 부르셨습니다." 출력
		System.out.println("서비스로 " + service + "곡을 추가해드렸습니다.");		// "서비스로 00곡을 추가해드렸습니다" 출력
		
		// 7) Scanner 닫기
		sc.close();		// Scanner 종료
		
	}	// 클래스 중괄호 끝
}	// main 메소드 중괄호 끝
