package typeCasting;

// 2번 : 다른 자료형 -> 문자열로
// + ""
public class TypeCasting01 {	// TypeCasting01 클래스 중괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		int num1 = 10;	// 정수형 변수 num1에 정수형 값 10으로 초기화
		float num2 = 20.17f;	// 실수형 변수 num2에 실수형 값 20.17로 초기화
		long num3 = 30L;	// 정수형 변수 num3에 정수형 값 30L로 초기화
		double num4 = 40.17;	// 실수형 변수 num4에 실수형 값 40.17로 초기화
		boolean isTrue = true;	// 논리형 변수 isTrue에 논리형 값 true로 초기화
		char alpha = 'a';	// 문자형 변수 char에 문자 값 'a'로 초기화
		
		System.out.println(num1);	// 정수 10 출력 후 줄바꿈
		System.out.println(num2);	// 실수 20.17 출력 후 줄바꿈
		System.out.println(num3);	// 정수 30 출력 후 줄바꿈
		System.out.println(num4);	// 실수 40.17 출력 후 줄바꿈
		System.out.println(isTrue);	// 논리형 값 true 출력 후 줄바꿈
		System.out.println(alpha);	// 문자 값 'a' 출력 후 줄바꿈
		
		System.out.println(num1 + num3);	// 정수 + 정수 = 정수	-> 40 출력 후 줄바꿈
		System.out.println(num2 + num4);	// 실수 + 실수 = 실수	-> 60.000007629395 출력 후 줄바꿈
		System.out.println(num1 + num4);	// 정수 + 실수 = 실수	-> 50.17 출력 후 줄바꿈
		
//		String result1 = num1 + num2 + ;
		String result1 = num1 + num3 + "";	
									// 사칙연산을 먼저 한후 문자열로 변경	-> 10 + 30 이후 문자열로 변환
		String result2 = "" + num1 + num3;	
									// 먼저 문자열로 변환된 후 그 이후의 내용은 전부 연결되어 저장된다	-> "10" + "30"와 동일
		System.out.println(result1);	// 문자열 40 출력 후 줄바꿈
		System.out.println(result2);	// 문자열 1030 출력 후 줄바꿈
		System.out.println(isTrue + "");	// true라고 출력되지만 논리형값이 아닌 문자열로서 출력된것이다
		System.out.println(alpha + "");		// 'a'라고 출력되지만 문자 값이 아닌 문자열로서 출력된것이다
		
	}	// main 메소드 중괄호 끝
}	// TypeCasting01 클래스 중괄호 끝
