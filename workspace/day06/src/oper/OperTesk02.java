package oper;	// 패키지

import java.util.Scanner;	// 입력클래스 import

// 6번 : 삼항연산자 실습1
public class OperTesk02 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// 두 수를 입력받아 비교
		// 크다, 작다, 같다가 각각 상황에 맞게 출력되도록 로직 구성
		
//		// 로직구성
//		// 1) 입력 클래스 import
//		Scanner sc = new Scanner(System.in);	// 입력클래스 선언
//		
//		// 2) 입력 요청 출력
//		System.out.print("비교할 두 수를 입력하여주세요 : ");	// "비교할 두 수를 입력하여주세요 : "출력
//		
//		// 3) 입력받을 변수 선언 및 대입	num1, num2
//		int num1 = sc.nextInt();	// 정수형 변수 선언 후 입력값 대입
//		int num2 = sc.nextInt();	// 정수형 변수 선언 후 입력값 대입
//		
//		// 4) 문자열 변수 선언
//		String result;	// 문자열 변수 선언
//		
//		// 5) num1 > num2 ? "num1이 더 큽니다" : (num1 == num2 ? "num1과 num2는 같습니다" : "num1이 더 작습니다"); 문자열 변수에 대입
//		result = num1 > num2 ? num1 + "이 더 큽니다." : (num1 == num2 ? num1 + "과 " + num2 + "는 같습니다." : num1 + "이 더 작습니다.");	// 크다 작다 같다 결과메시지 문자열 변수에 저장
//		
//		// 6) 출력
//		System.out.println(result);	// result에 저장되있는 값 출력 ->(크다, 같다, 작다)중 출력
//		
//		// 7) Scanner 종료
//		sc.close();	// Scanner 종료
		
		// 2. 한 개의 정수를 입력받아서 짝수인지 아닌지 출력하기
		// 짝수입니다 or 짝수가 아닙니다로 출력할 것
		
		// 로직구성
		// 1) 입력 클래스 import
		Scanner sc = new Scanner(System.in);	// 입력클래스 선언
		
		// 2) 입력 요청 출력
		System.out.print("한 개의 정수를 입력하여주세요 : ");	// "한 개의 정수를 입력하여주세요 : " 출력
		
		// 3) 입력받을 변수 선언 및 대입
		int number = sc.nextInt();	// 정수형 변수 number 선언 후 입력받은 값 대입
		
		// 4) 문자열 변수 선언
		String result;	// 문자열 변수 result 선언
		
		// 5) 문자열에 짝수인지 홀수인지 결과값 저장	number % 2 == 0 ? "짝수입니다" : "짝수가 아닙니다"
		result = number % 2 == 0 ? number + "은 짝수입니다." : number + "은 짝수가 아닙니다.";	// result에 (짝수/홀수)인지 저장
		
		// 6) 결과 출력
		System.out.println(result);	// 00은 짝수/홀수입니다.
		
		// 7) Scanner 종료
		sc.close();	// Scanner 종료
		
		
		
		
	}	// main 메소드 중괄호 끝
}	// 클래스 중괄호 끝


// 1. 
// Scanner sc = new Scanner(System.in);
// System.out.println("크기 비교할 숫자 1 입력 : ");
// int num1 = sc.nextInt();
// System.out.println("크기 비교할 숫자 2 입력 : ");
// int num2 = sc.nextInt();
// String result = num1 > num2 > ? num1 + "큰 수 : " : (num1 == num2) ? "같은 수" : num2 +"큰 수 : ";
// System.out.println(result);

// 1) 입력클래스 import
// 2) 정수형 변수 1개(입력메소드), 문자열 변수 1개(삼항연산자, 산술연산자, 관계연산자)
// 3) 출력
// System.out.println("숫자 1개 입력 : ");
// int number sc.nextInt();
// String result1 = (number % 2 == 0) ? "짝수입니다" : "짝수가 아닙니다";
// System.out.println("입력한 숫자 " + number + "는 " + result1);
// sc.close();