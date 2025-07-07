package scanner;

import java.util.Scanner;

// 9번 : 입력 메소드 실습1
public class ScannerTesk01 {
	public static void main(String[] args) {
		// 1. 본인의 이름과 성별을 입력받고 출력하기 (next()만 사용하기)
		// 입력 예 > 이름 입력 : 
		// 입력 예 > 성별 입력 : 
		// 출력 예 > 이름은 000이고 00입니다.
		
		// 로직 구성
		// 1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 클래스 import
		// 3) 이름 입력 메시지 출력
		System.out.print("이름 입력 : ");
		
		// 4) 이름 변수 선언후 이름입력
		String name = sc.next();
		
		// 5) 성별 입력 메시지 출력
		System.out.print("성별 입력 : ");
		
		// 6) 성별 변수 선언 후 성별입력
		String gender = sc.next();
		// char gender2 = sc.next().charAt(0);
		
		// 7) 전체 결과 출력
		System.out.println("이름은 " + name + "이고 " + gender + "입니다.");
		// System.out.printf("성별 : %s", gender2);
		
		// 8) 입력 클래스 닫기
		sc.close();
		
		// 로직 구성
		// 1) 입력클래스 선언
		// Scanner sc = new Scanner(System.in);
		
		// 2) 입력클래스 import
		// 3) 이름과 성별 입력 메시지 출력
		// System.out.println("이름과 성별을 띄어쓰기로 입력하세요 : ")
		
		// 4) 문자열 변수(name, gender) 선언
		// String name, gender;
		
		// 5) 변수에 입력 메소드 사용(next())
		// name = sc.next();
		// gender = sc.next();
		
		// 6) 결과 출력
		// System.out.printf("이름은 %s이고, 성별은 %s입니다.", name, gender);
		
	}
}
