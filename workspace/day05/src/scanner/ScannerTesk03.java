package scanner;

import java.util.Scanner;

// 11번 : 두 정수를 입력받아 합을 출력하기(next() 메소드를 사용하기)
public class ScannerTesk03 {
	public static void main(String[] args) {
		
		// 로직구성
		// 1) 입력클래스 선언, import
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력요구 메세지 2개 문자열 변수로 저장
		String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";
		
		// 2) 정수입력 메세지와 입력받기 2번 반복
		System.out.print(msg1);
		int num1 = Integer.parseInt(sc.next());
		
		System.out.print(msg2);
		int num2 = Integer.parseInt(sc.next());
		
		// 출력
		System.out.println("\n[출력] \n두 정수의 합 : " + (num1 + num2));
		
		sc.close();
	}
}


// 두 정수를 변수에 저장 후 합을 출력하기
// 1) 정수형 변수 2개 선언
// 2) 출력
// int num1 = 10, num2 = 20;
// System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

// 두 정수를 입력받은 후 합을 출력하기
// 1) 입력클래스 import
// Scanner sc = new Scanner(System.in());

// 2) 문자열 변수 2개, 정수형 변수 3개(입력변수2개, 결과변수 3개)
// String msg1 = "정수1 입력 : ", msg2 = "정수2 입력 : ";
// int num1, num2, result;
// 3) 메시지 출력 1
// System.out.println(msg1);
// 4) 입력 메소드 사용(next())
//	// num1 = Integer.parseInt(sc.next());
// num1 = sc.nextInt();
// 5) 메시지 출력 2
// System.out.println(msg2);
// 6) 입력 메소드 사용(next())
//  //num2 = Integer.parseInt(sc.next());
// num2 = sc.nextInt();
// 7) 결과변수 = 변수1 + 변수2
// result = num1 + num2;
// 8) 출력
// System.out.println(num1 + " + " + num2 + " = " + result);
// 9) 스캐너 해제
// sc.close();
