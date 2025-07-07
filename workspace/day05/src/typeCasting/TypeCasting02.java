package typeCasting;
// 3번 : 문자열 자료형 -> 다른 기본 자료형으로
public class TypeCasting02 {	// TypeCasting02 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		// 기본자료형 -> 문자열 자료형
		String str1 = 3 + "";	// 문자열 변수 str1을 "3"으로 초기화
		String str2 = 6.17 + "";	// 문자열 변수 str2을 "6.17"으로 초기화
		String str3 = 'a' + "";	// 문자열 변수 str3을 "a"으로 초기화
		String str4 = true + "";	// 문자열 변수 str4을 "true"으로 초기화
		
		System.out.println(str1);	// 문자열 3 출력후 줄바꿈
		System.out.println(str2);	// 문자열 6.17 출력 후 줄바꿈
		System.out.println(str3);	// 문자열 a 출력 후 줄바꿈
		System.out.println(str4);	// 문자열 true 출력 후 줄바꿈
		
		// 문자열 -> 기본자료형
		int number1 = Integer.parseInt(str1);	// 문자열 str1을 정수로 변경
		System.out.println(number1 + 3);	// 3+3의 값 6 출력 후 줄바꿈
		
		double number2 = Double.parseDouble(str2);
		System.out.println(number2);
		
		boolean isTrue2 = Boolean.parseBoolean(str4);
		System.out.println(!isTrue2);	// true에 !가 쓰여 값이 false로 변환되었다
		
		char ch = "hello".charAt(4);	// ch에 문자열 중 ()에 들어있는 숫자의 위치에있는 글자를 저장한다
		System.out.println(ch);
		
		
	}	// main 메소드 중괄호 끝
}	// TypeCasting02 클래스 중괄호 끝
