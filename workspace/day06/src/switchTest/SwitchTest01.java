package switchTest;	// 패키지
// 14번 : switch문
public class SwitchTest01 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		String animal = "고양이";	// 문자열 변수 animal에 "고양이"로 초기화
		
		switch("고양이") {	// 조건문 switch 중괄호 시작, 조건식은 "고양이"
		case "고양이":	// case가 "고양이"인 경우
			System.out.println("선택한 동물은 고양이입니다.");	// "선택한 동물은 고양이입니다." 출력
			break;	// 조건문 빠져나가기
		case "호랑이":	// case가 "호랑이"인 경우
			System.out.println("선택한 동물은 호랑이입니다.");	// "선택한 동물은 호랑이입니다." 출력
			break;	// 조건문 빠져나가기
		case "여우":	// case가 "여우"인 경우
			System.out.println("선택한 동물은 개입니다.");	// "선택한 동물은 여우입니다." 출력
			break;	// 조건문 빠져나가기
		default:	// 조건식에 맞는 case가 없는 경우
			System.out.println("선택한 동물이 없습니다.");	// "선택한 동물이 없습니다." 출력
			break;	// 조건문 빠져나가기
		}	// switch 중괄호 끝
		
		switch(9) {	// 조건문 switch 중괄호 시작, 조건식은 9
		case 100:	// case가 100인 경우
			System.out.println("100입니다.");	// "100입니다." 출력
			break;	// 조건문 빠져나가기
		case 9:	// case가 9인 경우
			System.out.println("9입니다.");	// "9입니다." 출력
			break;	// 조건문 빠져나가기
		case 49:	// case가 49인 경우
			System.out.println("49입니다.");	// "49입니다." 출력
			break;	// 조건문 빠져나가기
		default:	// 조건식에 맞는 값이 없는 경우
			System.out.println("case에 값이 없습니다.");	// "case에 값이 없습니다." 출력
			break;	// 조건문 빠져나가기
		}	// switch 중괄호 끝
		
	}	// main 메소드 중괄호 끝
}	// 클래스 중괄호 끝
