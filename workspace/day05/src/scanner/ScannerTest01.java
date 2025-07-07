package scanner;

import java.util.Scanner;	

// 5번 : 입력클래스(Scanner)
public class ScannerTest01 {	// ScannerTest01 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// System.out.println();
		//String name = "김용문";
		
		// 입력 클래스
		// 입력 메소드를 사용하기 위해서 14번 라인의 한 줄이 반드시 작성되어야한다
		// 자동 import 단축키 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");	// "이름 입력 : "문자열이 콘솔창에 출력된 후 줄바꿈
		
//		String name = sc.next();	// next() 입력 메소드 : 콘솔창에서 입력을 받고 입력받을 값을 String타입으로 가져오는 기능을 한다
//		System.out.println(name + "님 환영합니다.");	// name(콘솔창에 작성된 값) 값 + "님 환영합니다."를 콘솔창에 출력한 후 줄바꿈용
		
		String name1 = sc.nextLine();
		String name2 = sc.next();
//		String name3 = sc.next();
		System.out.println(name1);
		System.out.println(name2);
//		System.out.println(name3);
//		String name4 = sc.next();
//		System.out.println(name4);
		
		sc.close();
		
	}	// main 메소드 중괄호 끝
}	// ScannerTest01 클래스 중괄호 끝
