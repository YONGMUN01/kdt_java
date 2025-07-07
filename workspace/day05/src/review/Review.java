package review;

// 1번 : 복습
public class Review {	// Review 클래스 줄괄호 시작
	public static void main(String[] args) {	// main 메소드 중괄호 시작
		
		
		// printf() : 서식에 맞춰 출력하고 줄바꿈되지 않는 출력 메소드
		System.out.printf("'%s' '%d' '%f' '%s'\n", "hello", 2025, 6.17, true);	// "'hello' '2025' '6.17' 'true'" 출력 후 줄바꿈
		System.out.printf("'%-7.2s' '%-5d' '%10.2f' '%-5s'\n", "hello", 2025, 6.17, true);	// "'he     ' '2025 ' '       6.17' 'true '" 출력 후 줄바꿈
		
		// 변수
		byte num1 = 5;	// 정수형 변수 num1에 정수형 값 5로 초기화
		byte num2 = 127;	// 정수형 변수 num2에 정수형 값 127로 초기화
		System.out.println(num1);	// 정수형 값 5 출력 후 줄바꿈
		System.out.println(num2);	// 정수형 값 127 출력 후 줄바꿈
		
		int num3 = 128;	// 정수형 변수 num3에 정수형 값 128로 초기화
		byte num4 = (byte)num3;		// 강제형변환 과정중 오버플로우 발생
		System.out.println(num4);	// 오버플로우 발생으로 -128 출력후 줄바꿈
		
	}	// main메소드 중괄호 끝
}	// Review 클래스 중괄호 끝
