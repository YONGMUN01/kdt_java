package review;
// 복습 1번
import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		// 0) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		// 1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항연산자)
		// 1) 입력 메시지 출력
		System.out.println("정수 1개를 입력하세요 : ");
		
		// 2) 정수형 변수 선언 nextLine()형변환
		int num = Integer.parseInt(sc.nextLine());
		
		// 3) 출력 삼항연산자
		System.out.println(num + "는/은" + (num % 2 == 0 ? "짝수입니다." : "홀수입니다."));
		
		
		// 2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		// 1) 입력 메시지 출력
		// 2) 정수형 변수 1개 선언 입력메소드
		// 3) 조건문(if-else if-else)
		//	3-1) if(변수 > 0){
		//	3-2) 	양수 출력;
		//	3-3) } else if(변수 == 0){
		//	3-4)	0출력;
		//	3-5) } else{
		//	3-6)	음수 출력;
		//	3-7) }
		
		System.out.println("한 개의 정수를 입력하세요. : ");
		int num2 = sc.nextInt();
		if(num2 > 0) {
			System.out.println("양수");
		} else if(num2 == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
		// 3. 나이를 입력받아서 다음 기준으로 출력하기
		// 1) 입력 메시지 출력
		// 2) 나이변수 입력메소드 nextInt()
		// 3) 조건문(if-else if-else)
		//	3-1) if(나이 <= 12){
		//	3-2)	어린이입니다 출력
		//	3-3) } else if(나이 <= 19) {
		//	3-4)	청소년입니다 출력
		//	3-5) } else{
		//	3-6)	성인입니다 출력
		//		 }
		
		while(true) {
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();
			if(age <= 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			if(age > 0 && age <= 12) {
				System.out.println("어린이입니다.");
				break;
			} else if(age <= 19) {
				System.out.println("청소년입니다.");
				break;
			} else {
				System.out.println("성인입니다.");
				break;
			}	
		}
		
		
		// 4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기
		//	  단, 세 개의 정수를 모두 다른 숫자이어야한다(중복값 x)
		
		System.out.println("정수 3개 입력 : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		// 1) 중복된 숫자일 경우 중복된 숫자는 안됩니다 출력
		if (number1 == number2 || number2 == number3 || number1 == number3) {
			System.out.println("중복된 숫자는 안됩니다.");
		} else {
			int first = 0, second = 0, third = 0;
			
			// 2) 모든 경우를 비교하여 내림차순으로 정렬
			// number1이 가장 큰 수일 때
			if(number1 > number2 && number1 > number3) {	// number1이 가장 클 때
				first = number1;
				if(number2 > number3) {
					second = number2;
					third = number3;
				} else {
					second = number3;
					third = number2;
				}
			} else if(number2 > number1 && number2 > number3) {	// number2이 가장 클 때
				first = number2;
				if(number1 > number3) {
					second = number1;
					third = number3;
				} else {
					second = number3;
					third = number1;
				}
			}else {	// number3이 가장 클 때
				first = number3;
				if(number1 > number2) {
					second = number1;
					third = number2;
				}
			}	// if-else if-else문 중 else문의 중괄호 끝
			
			System.out.printf("정렬된 숫자 %d %d %d\n", first, second, third);
			
		}	// 첫번째 else문의 중괄호 영역 끝
		sc.nextLine();
		
		// 5. 사용자가 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		// 1) 반복문(while문) -> true
		// 2) { 입력메시지 출력
		// 3)	변수 입력메소드 nextLine()
		// 4)	조건문(if-else)
		//		4-1) if문	.equals() 비교
		//		4-2)	종료
		//		4-3)	break;
		//		4-4) else문
		//		4-5)	입력된 문자열 출력
		//		4-6) 	continue;
		
		while(true) {
			System.out.println("문자열을 입력하세요(X입력시 종료) : ");
			String str1 = sc.nextLine();
//			if(str1.equals("X") || str1.equals("x")) {
			if(str1.charAt(0) == 'x' && str1.length() == 1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("입력한 문자열 : " + str1);
			}
		}
		
		
		
		
		
		// Scanner 종료
		sc.close();
		
	}
}
