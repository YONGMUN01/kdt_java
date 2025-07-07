package oper;	// 패키지
// 3번 : 관계연산자와 논리 연산자
public class OperTest01 {	// 클래스 중괄호 시작
	public static void main(String[] args) {	// main 중괄호 시작
		
		System.out.println("=======관계연산자=======");		// "=======관계연산자=======" 출력
		
		int num1 = 10, num2 = 20, num3 = 10;	// num1, 2, 3이라는 정수형 변수 선언 후 10, 20, 10으로 초기화
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));	// "10 > 20 : false" 출력
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));	// "10 < 20 : true" 출력
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));	// "10 >= 20 : false" 출력
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));	// "10 <= 20 : true" 출력
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));	// "10 == 20 : false" 출력
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));	// "10 != 20 : true" 출력
		System.out.println(num1 + " == " + num3 + " : " + (num1 == num3));	// "10 == 20 : true" 출력
		
		System.out.println(10 >= 10);	// true 출력
		
		System.out.println("\n=======논리 연산자=======");		// 줄바꿈 후 "=======논리 연산자=======" 출력
		System.out.println("and : 둘 다 참이면 참(&&)");	// "and : 둘 다 참이면 참(&&)" 출력
		System.out.println(true && true);	// true 출력
		System.out.println(true && false);	// false 출력
		System.out.println(false && true);	// false 출력
		System.out.println(false && false);	// false 출력
		
		System.out.println("\nor : 둘 중 하나라도 참이면 참(||)");		// 줄바꿈 후 "nor : 둘 중 하나라도 참이면 참(||)" 출력
		System.out.println(true || true);	// true 출력
		System.out.println(true || false);	// true 출력
		System.out.println(false || true);	// true 출력
		System.out.println(false || false);	// false 출력
		
		System.out.println("\nnot : 참이면 거짓, 거짓이면 참(!)");		// "not : 참이면 거짓, 거짓이면 참(!)" 출력
		System.out.println(!true);	// false 출력
		System.out.println(!false);	// true 출력
		
		
		
	}	// main 중괄호 끝
}	// 클래스 중괄호 끝
