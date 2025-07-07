package ifTest;	// 패키지

import java.util.Scanner;	// 입력클래스 import

// 11번 : if~else문 실습1
public class IfTesk01 {		// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// 1. 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		// 로직구성
		// 1) 입력 클래스 선언, import
		Scanner sc = new Scanner(System.in);	// 입력 클래스 선언
		
		// 2) 입력요구 메시지 출력
		System.out.println("[출력]");		// "[출력]" 출력
		System.out.print("숫자를 입력하여주세요 : ");	// "숫자를 입력하여주세요 : " 출력
		
		// 3) 정수형 변수 선언 후 입력받은 값 대입
		int number = sc.nextInt();	// 정수형 변수 선언 후 입력받은 값 대입
		
		// 4) if문의 조건식에 변수 % 2 == 0 작성 후 짝수 메시지 출력
		if(number % 2 == 0) {	// if문 중괄호 시작, number을 2로 나눈나머지가 0인 경우
			System.out.println(number + "은 짝수입니다.");	// "숫자는 짝수입니다." 출력
		}	// if문 중괄호 끝
		
		// 5) else문에 홀수 메시지 출력
		else {	// else문 중괄호 시작, number을 2로 나눈나머지가 0이 아닌 경우
			System.out.println(number + "은 홀수입니다.");	// "숫자는 홀수입니다." 출력
		}
		
		// 6) Scanner 닫기
		sc.close();	// Scanner 종료
		
		// 자료형들의 기본값
		// 정수 0, 실수 0.0, 문자형 ' ', 문자열 "" or null, 논리형 false
		
	}
}

// 1) 입력 클래스 import
// 2) 정수형 변수 선언
// 3) 입력 메시지 출력
// 4) 변수 입력메소드 사용
// 5) 조건문 (if ~ else)문
	// if 조건식 (산술연산자(%), 관계연산자(!=))
	//	출력메소드
	// else
	//	출력메소드
// 6) 스캐너 닫기

// Scanner sc = new Scanner(System.in);
// int choice = 0;
// System.out.println("숫자 1개 입력 : ");
// choice = sc.nextInt();
// if(choice % 2 == 1){
//	 	System.out.println("홀수입니다");
// }
// else {
//		System.out.println("짝수입니다");
// }

// 삼항연산자
// System.out.println((choice % 2 != 1) ? "짝수입니다" : "홀수입니다");	// 삼항연산자로 choice를 2로 나눈 나머지가 1이 아니면 짝수, 맞으면 홀수

// sc.close();

