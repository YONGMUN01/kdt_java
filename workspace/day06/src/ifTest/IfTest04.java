package ifTest;	// 패키지
// 13번 : if-if문, if-else if문 차이 / if문 중첩
public class IfTest04 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		// if-if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100;	// 정수형 변수 num, grade 선언 후 각각10, 100으로 초기화
		if(num > 5) {	// if문 중괄호 시작, num이 5보다 클 때
			System.out.println("num은 5보다 큽니다.");	// "num은 5보다 큽니다." 출력
		}	// if문 중괄호 끝
		if(num > 3) {	// if문 중괄호 시작, num이 3보다 클 때, 위의 if문 출력 후 출력된다
			System.out.println("num은 3보다 큽니다.");	// "num은 3보다 큽니다." 출력
		}	// if문 중괄호 끝
		
		// if-else if문 :위의 조건식이 true면 아래 있는 조건식은 무시된다
		if(num > 5) {	// if문 중괄호 시작, num이 5보다 클 때
			System.out.println("num은 5보다 큽니다.");	// "num은 5보다 큽니다." 출력
		}else if(num > 3) {	// if문 중괄호 끝, else if문 중괄호 시작, num이 3보다 클 때
			System.out.println("num은 3보다 큽니다.");	// "num은 3보다 큽니다." 출력, 그러나 이 코드에서는 출력되지 않는다
		}	// else if문 중괄호 끝
		
		// if문 중첩
		// 90점 이상은 A, 100점은 만점으로 A출력
		if(grade == 100) {	// if문 중괄호 시작, grade의 값이 100일 때
			System.out.println("만점으로 A");	// "만점으로 A" 출력
		}else if(grade >= 90) {	// if문 중괄호 끝, esle if문 중괄호 시작, grade가 90보다 크거나 같을 때
			System.out.println("A");	// "A" 출력, 그러나 이 코드에서는 출력되지 않는다
		}	// else if문 중괄호 끝
		
		if(grade >= 90) {	// if문 중괄호 시작, grade가 90보다 크거나 같을 때
			if(grade == 100) {	// 중첩 if문 중괄호 시작, grade가 100일 때
				System.out.print("만점으로 A");	// "만점으로 A" 출력
			}else {	// 중첩 if문 중괄호 끝, 중첩 if-else의 else문 중괄호 시작
			System.out.println("A");	// "A" 출력
			}	// 중첩 if-else문의 else문 중괄호 끝
		}	// if문 중괄호 끝
	}	// main 메소드 중괄호 끝
}	// 클래스 중괄호 끝
