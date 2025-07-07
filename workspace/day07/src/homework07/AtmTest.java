package homework07;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ATM 메뉴에서 입금, 출금, 잔액조회 하기
				// [조건]
				// 초기 잔액은 10000원으로 설정
				// 메뉴 선택에 따라 작업 수행
				// 종료시 프로그램 종료
				// 숫자(번호)로 입력받기
				// 로직 입력
				// 1) 정수형 변수 2개 선언(초기잔액, 메뉴), 문자열 변수 선언 후 초기화
				// 2) while
				// 		3) syso(문자열 변수)
				//		3-1) 입력메시지 출력
				//		3-2) 메뉴에 입력받은 값 대입
				//		3-3) switch(메뉴변수)
				//			case 1: 잔액조회
				//			case 2: 입금
				//			case 3: 출금
				//			case 4: 종료기능
				//			default: 다시 선택하세요 출력 continue
				int money = 10000, menu = 0;
				String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : "
						+ "\n1. 잔액조회"
						+ "\n2. 입금"
						+ "\n3. 출금"
						+ "\n4. 종료"	// 종료기능은 추가
						+ "\n선택 : ";
				while(menu != 4) {
					System.out.print(msg);
					menu = sc.nextInt();
					
					switch(menu) {
					case 1:
						System.out.println("김용문님의 현재 잔액은 : " + money);
						System.out.println("기본화면으로 돌아갑니다.");
						break;
					case 2:
						System.out.println("000님의 계좌로 5000원 입금하겠습니다.");
						System.out.println("기본화면으로 돌아갑니다.");
						break;
					case 3:
						System.out.println("김용문님의 계좌에서 " + money + "원을 출금합니다.");
						System.out.println("기본화면으로 돌아갑니다.");
						break;
					case 4:
						System.out.println("프로그램을 종료합니다.");
						break;
					default:
						System.out.println("다시 선택해주세요.");
						break;
					}
				}
				
				sc.close();
	}
}
