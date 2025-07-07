package forTest;

// 6번 : for문 연습
public class ForTask01 {
	public static void main(String[] args) {

		// for문만 사용
		// 1. 100부터 1까지 출력(tab키로 띄어쓰기)
		// 로직구성
		// 1) for문 초기식 int i = 0, 조건식 i < 100, 증감식 i++{
		// 출력
		// }

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + "	");
		}
		System.out.println();

		// 2. 구구단 3단만 출력(3 x 1 ~ 3 x 9)
		// 로직구성
		// 1) for문 초기식 int i = 1, 조건식 i < 10, 증감식 i++{
		// 출력 3 * i
		for (int i = 1; i < 10; i++) {
			System.out.print("3 X " + i + " = " + (i * 3) + "	");
		}
		System.out.println();

		// 3. A ~ F 출력(초기식 char i = 'A') A 유니코드 값 = 65, Z 유니코드 값 = 90
		// 1) 문자형 변수 a 선언 후 'A'로 초기화
		// 2) for 초기식 char i = 'A', 조건식 i < 50, i++{
		// syso(i)

		for (char i = 'A'; i <= 'F'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (char i = 'A'; i <= 70; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 4. A ~ F 출력(초기식 int i = 0)
		// 2) for 초기식 int i = 0, 조건식 i < 50, i++{
		// 3) if문 (조건식 (a + i) == 90) break;
		// }
		for (int i = 0; i < 6; i++) {
			System.out.print((char) (65 + i) + " ");
		}
		System.out.println();

		// 5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		// 1) a는 97부터 시작 B는 66부터 시작
		// 2) for문 초지기식 int i = 0, i < 35, i++{
		// if문 i % 2 == 0일 때	소문자
		// syso((char)(i + 97))
		// else문	대문자
		// syso((char)(i + 65))
		// }

		for (int i = 0; i < 26; i++) {
			if (i % 2 == 0) {
				System.out.print((char) (i + 97) + " ");
			} else {
				System.out.print((char) (i + 65) + " ");
			}
		}
		System.out.println();
		
		for(int i = 0; i < 26; i++) {
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
		}
		
		// 첫번째 반복문
		// 초기식 i가 0, 조건식 0 < 26 true, 중괄호영역 (char)(97) => a, 증감식 i++ => i = 0 + 1
		// 현재 i의 값 1
		// 조건식 1 < 26 true, 중괄호영역 (char)(1 + 65) => B, 증감식 i++ => i = 1 + 1
		// 현재 i의 값 2
		// ...
		// 현재 i의 값 25
		// 조건식 25 < 26 true, 중괄호영역 (char)(25 + 65) => Z, 증감식 i++ => i = 25 + 1
		// 현재 i의 값 26
		// 조건식 26 < 26 false, for문 탈출!
		
		
		
		
	}
}
