package lambdaTask;

import java.util.Scanner;

public class LambdaMain {
	public static void main(String[] args) {
		
		// 인터페이스명 : CombInter(함수형 인터페이스)
		// 두 문자열을 입력받아 연결하는 추상 메소드를 만든다(명령문은 1줄)
		// 메인메소드에서 익명클래스로 객체화
		// 메인메소드에서 람다식으로 객체화
		Scanner sc = new Scanner(System.in);
		
		CombInter c1 = (str1, str2) -> System.out.println(str1 + str2);
		c1.combine(sc.next(), sc.next());
		
//		CombInter st = new CombInter() {
//
//			@Override
//			public String sumStr(String str1, String str2) {
//				return str1 + str2;
//			}
//			
//		};
//		
//		CombInter sumString = (str1, str2) -> str1 + str2;
//			
//		System.out.print("문자열 입력 -> ");
//		System.out.println(sumString.sumStr(sc.next(), sc.next()));
//		System.out.println(st.sumStr(sc.next(), sc.next()));
//		
		sc.close();
	}
}
