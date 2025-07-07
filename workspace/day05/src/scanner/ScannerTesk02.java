package scanner;

import java.util.Scanner;

// 10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTesk02 {
	public static void main(String[] args) {
		
		// 1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용해서 출력형태 만들기)
		// 입력1 : 자바는
		// 입력2 : 객체지향
		// 입력3 : 언어입니다
		// 출력
		// 자바는 
		// 객체지향 
		// 언어입니다
		
		// 1) 입력클래스 선언, 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력 1, 2, 3 을 출력하고 각각 문자열을 입력받기
		System.out.print("입력1 : ");
		String input1 = sc.next();
		
		System.out.print("입력2 : ");
		String input2 = sc.next();
		
		System.out.print("입력3 : ");
		String input3 = sc.next();
		
		// 3) 출력
		System.out.println("[출력]");
		//System.out.println(input1 + "\n" + input2 + "\n" + input3);
		System.out.printf("%s \n%s \n%s \n", input1, input2, input3);
		
		// 버퍼에 엔터값 삭제
		sc.nextLine();
		
		// 2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
		// 출력 시 printf 사용, 형변환 반드시 적용해서 출력할 것
		// 이름입력 : 홍길동
		// 나이입력 : 20
		// 취미입력 : 여행
		// [출력]
		// 홍길동은 20살이고 취미는 여행입니다.
		// 홍길동은 2026년 에 21살입니다.
		
		System.out.println("==============================\n");
		
		// 1) 이름입력 메세지 작성
		System.out.print("이름입력 : ");
		
		// 2) 이름 입력받기 nextLine()
		String name = sc.nextLine();
		
		// 3) 나이입력 메세지 작성
		System.out.print("나이입력 : ");
		
		// 4) 나이 입력받기 next()
		// 4-1) 나이 형변환
		int age = Integer.parseInt(sc.next());
		sc.nextLine();
		
		// 5) 취미입력 메세지 작성
		System.out.print("취미입력 : ");
		
		// 6) 취미 입력받기 nextLine()
		String hobby = sc.nextLine();
		
		// 7) 출력 메세지 작성
		System.out.printf("[출력] \n%s은 %d살이고 취미는 %s입니다.\n%s은 2026년에 %d살입니다.", name, age, hobby, name, age + 1);
		
		
		// 입력클래스 닫기
		sc.close();
	}
}
