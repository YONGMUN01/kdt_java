package review;

import java.util.Scanner;

// 3) 복습문제
public class Review01 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		// 그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기
		
		// 로직구성
		// 1) 입력클래스 선언, import
		// 2) 숫자 변수 선언 및 초기화
		// 3) 입력요청 메시지 출력
		// 4) 숫자 변수에 입력받은 값 대입
		// 5) if문 조건식(숫자 변수 >= 1 && 숫자 변수 <= 10){
				// 값 제곱 출력
			//}
		// 6) else문
			// 잘못입력했습니다 출력
		// 7) Scanner 종료
		
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		System.out.print("1부터 10 사이의 숫자만 입력해주세요 : ");
//		
//		num = sc.nextInt();
//		
//		if(num >= 1 && num <= 10) {
//			System.out.println(num * num);
//			System.out.println(num * 2);
//			
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
		
		// 문자열끼리의 비교는 관계연산자(==)를 사용하지 않고
		// .equals() 메소드를 사용해서 비교한다!!
		System.out.print("문자열1 입력 : ");
		String data1 = sc.nextLine();
		System.out.print("문자열2 입력 : ");
		String data2 = sc.nextLine();
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		if(data1.equals(data2)) {
			System.out.println("두 문자는 같습니다.");
		}else {
			System.out.println("두 문자는 같지 않습니다.");
		}
		
		
		sc.close();
		
		// 1) 입력클래스 import
		// 2) 정수형 변수
		// 3) 출력 메시지
		// 4) 변수 정수형 입력메소드
		// 5) if 조건식 : 1 <= 변수 && 변수 <= 10 , 0 < 변수 && 변수 < 11
			// 6) 변수 * 변수 출력
		// 7) else문
			// 8) 잘못 입력했습니다 출력
		// 9) sc.close()
	}
}


