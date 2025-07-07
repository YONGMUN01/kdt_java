package whileTest;
// 8번 : while문 기초
public class WhileTest01 {
	public static void main(String[] args) {
		
		
		// 안녕하세요 문자열을 10번 출력하기
		// 조건식을 true로 작성 시 무한루프에 빠진다
//		while(true) {
//			System.out.println("안녕하세요!");
//		}
		
		// 변수 선언
		// while(조건식){}
		int count = 0;
		while(count < 10) {
//			System.out.println(count);	// 증감식이 출력문 다음에 작성되면 0 ~ 9까지 출력
			count++;
//			System.out.println(count);	// 증감식이 출력문 전에 작성되면 1 ~ 10까지 출력
			System.out.println("안녕하세요!");
		}
	}
}
