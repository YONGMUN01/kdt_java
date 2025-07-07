package ifTest;	// 패키지
// 12번 : if-else if-else문
public class IfTest03 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		// 양수, 음수, 0인지 출력하기
		System.out.println("출력 시작");	// "출력 시작" 출력
		
		int num = 9;	// 정수형 변수 num에 9라는 값으로 초기화
		
		if (num > 0) {	// if문 중괄호 시작, num이 0보다 클 때
			System.out.println("양수입니다.");	// "양수입니다." 출력
		}	// if문 중괄호 끝
		else if (num < 0) {	// else if문 중괄호 시작, num이 0보다 작을 때
			System.out.println("음수입니다.");	// "음수입니다." 출력
		}	// else if문 중괄호 끝
		else {	// else 중괄호 시작
			System.out.println("0입니다.");	// "0입니다." 출력
		}	// else문 중괄호 끝
		

		if (num > 5 && num < 15) {	// if문 중괄호 시작, num이 5보다 크고 15보다 작을 때
			System.out.println("5보다 큽니다.");	// "5보다 큽니다." 출력
		}	// if문 중괄호 끝
		else if (num > 3) {	// 위의 if문을 출력하고 else if문은 출력되지 않는다, else if문 중괄호 시작, num이 3보다 클 때
			System.out.println("3보다 큽니다.");	// "3보다 큽니다."출력, 그러나 이 코드에서는 출력되지 않는다
		}	// else if문 중괄호 끝
		else {	// else문 중괄호 시작
			System.out.println(num);	// num에 저장된 변수 출력, 그러나 이 코드에서는 출력되지 않는다
		}	// else문 중괄호 끝
		
		System.out.println("출력 끝");	// "출력 끝" 출력
		
	}	// main 메소드 중괄호 끝
}	// 클래스 중괄호 끝
