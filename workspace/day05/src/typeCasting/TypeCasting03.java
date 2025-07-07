package typeCasting;
// 4번 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 {	// TypeCasting03클래스 중괄호 시작
	public static void main(String[] args) {	//main 메소드 중괄호 시작
		String data1 = "10";	//문자열 변수 data1을 선언후 "10"으로 초기화
		String data2 = "abc";	//문자열 변수 data2을 선언후 "abc"으로 초기화
		
		System.out.println(data1 + 1);	// 문자열 + 1 => 연결 -> 101을 콘솔창에 출력 후 줄바꿈
		System.out.println(data2);	//	문자열 abc을 콘솔창에 출력후 줄바꿈
		
		char alpha = data2.charAt(1);	// data2의 1위치의 문자 b를 alpha에 저장
		System.out.println(alpha);	// alpha에 저장되어있는 문자 b를 콘솔창에 출력 후 줄바꿈
		
		// "TRUE" 문자열을 변환후 출력
		boolean result1 = Boolean.parseBoolean("TRUE");	// 문자열 TRUE를 논리형 값으로 변환후 result1에 저장
		System.out.println(result1);	// result1에 저장되있는 논리형 값 true를 콘솔창에 출력후 줄바꿈
		// 문자열이 TRUE(대소문자 무관)이면, true를 반환하고, 그렇지 않으면 false를 반환
		
	}	// main 메소드 중괄호 끝
}	// TypeCasting03 클래스 중괄호 끝
