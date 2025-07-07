package methodTest;

import java.util.Scanner;

public class MethodTask02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MethodTask02 mt = new MethodTask02();
		
		// 1. 정수 1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
		// 메소드명 : checkNum
		System.out.print("정수를 입력해주세요 : ");
		System.out.println("입력하신 수는 " + mt.checkNum(sc.nextInt()) + "입니다.");
		sc.nextLine();
		
		// 2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
		// 메소드명 : getSum
		int[] arr1 = {1, 6, 84, 54, 65, 5, 4, 3, 53, 99};
		System.out.println(mt.getSum(arr1));
		
		// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		// 메소드명 : reverseStr
		// hello => olleh
		System.out.print("문자열을 입력해주세요. : ");
		String msg = sc.nextLine();
		System.out.println(mt.reverseStr(msg));
		
		// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		// 메소드명 : contains
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
		// syso(배열명, 10) => true
		int[] arr2 = {65, 4, 66, 10, 6, 87};
		boolean isTrue = mt.contains(arr2, 10);
		System.out.println("찾으시는 수 10의 존재는 " + isTrue + "입니다.");
		
		// 5. 단수를 매개변수로 받아 해당 단의 구구단을 (1 ~ 19)을 출력하는 메소드
		// 메소드명 : printGugudan
		// 3 * 1 = 3 ... 3 * 19 = 57
		System.out.print("단수 입력 : ");
		mt.printGugudan(sc.nextInt());
		sc.nextLine();
		
		
		// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
		// 메소드명 : compareLength
		String str1, str2;
		System.out.print("비교할 2 문자열을 입력하시오 : ");
		str1 = sc.next();
		str2 = sc.next();
		sc.nextLine();
		System.out.println("두 문자열의 비교 결과는 : " + mt.compareLength(str1, str2));
		
		
		
		// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
		// 메소드명 : loginTry
		boolean isTrue2 = false;
		System.out.println("아이디와 비밀번호를 입력하세요. : ");
		for(int i = 0; i < 3; i++) {
			System.out.println("[" + (i + 1) + "회 시도]");
			isTrue2 = mt.loginTry(sc.next(), sc.next());
			if(isTrue2 == true)
				break;
			if(i == 2) {
				System.out.println(1 + i + "회 틀리셨습니다. 프로그램을 종료합니다.");
			}
		
		
		}
		
		sc.close();
	}
	// 1. 
	// 1) 문자열 리턴타입, 메소드명 checkNum, 정수형 매개변수 1개
	// 2) 리턴값으로 삼항연산자를 사용해 짝수, 홀수 판단하기
	String checkNum(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
	// 2. 
	// 1) 정수형 리턴타입, 메소드명 getSum, 배열 매개변수
	// 2) 총합을 저장할 변수 선언
	// 3) for 초기식 i = 0; i < 배열.length; i++
	// 4)		sum += 배열[i];
	// 5) sum을 리턴값으로 반환
	int getSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	// 3.
	// 1) 문자열 리턴타입, 메소드명 reverseStr, 매개변수 문자열
	// 2) 배열 선언 배열[문자열.length()], 마지막 문자열 합칠 변수 선언
	// 3) for문 초기식 i = 0; i < 배열.length; i++
	//		배열[i] = 매개변수.charAt(매개변수.length() - 1)
	//		문자열 변수 += 배열[i]
	// 4) 문자열 변수 리턴값으로 반환
	String reverseStr(String msg) {
		char[] arr = new char[msg.length()];
		String result = "";
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = msg.charAt(msg.length() - 1 - i);
			result += arr[i];
		}
		
		return result;
	}
	
	// 4.
	// 1) 논리형 리턴타입, 메소드명 contains, 매개변수 정수형 배열, 정수형 변수
	// 2) 논리형 변수 선언, count 변수 선언
	// 3) while(count == 배열.length)
	//		if(arr[count] == 매개변수)
	//			논려형 변수 = true;
	//			break;
	//		count++
	// 4) 리턴값 논리형 변수 반환
	boolean contains(int[] arr, int num) {
		boolean isTrue = false;
		int count = 0;
		
		while(count != arr.length) {
			if(arr[count] == num) {
				isTrue = true;
				break;
			}
			count++;
		}
		
		return isTrue;
	}
	
	// 5. 단수를 매개변수로 받아 해당 단의 구구단을 (1 ~ 19)을 출력하는 메소드
	// 1) void 리턴타입, 메소드명 printGugudan, 정수형 매개변수
	// 2) 단수 출력
	// 3) for문 초기식 i = 1; i <= 19; i++
	// 3-1)		syso(매개변수 x i = (i * 매개변수))
	void printGugudan(int num) {
		System.out.println("[" + num + "단]");
		for(int i = 1; i <= 19; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
	
	// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	// 1) 논리형 리턴타입, 메소드명 compareLength, 문자열 매개변수 2개
	// 2) 논리형 변수 1개 선언
	// 3) 삼항연산자 논리형 변수 = a.length == b.length ? true : false
	// 4) 논리형 변수 값 반환
	boolean compareLength(String str1, String str2) {
		boolean isTrue = str1.length() == str2.length() ? true : false;
		return isTrue;
	}
	
	// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	// 1) void 리턴타입, 메소드명 loginTry, 문자열 매개변수 2개
	// 2) 문자열 변수 2개 선언(아이디, 비밀번호)
	// 3) 		if문(아이디.equals(아이디 매개변수))
	// 3-1)			if(비밀번호.equals(비밀번호 매개변수))
	// 3-1-1)			syso(로그인 되었습니다)
	// 3-2)			else
	// 3-2-1)				syso(비밀번호를 틀리셨습니다. 다시 시도해주세요.);
	// 4)		else
	// 4-1)			syso(아이디를 틀리셨습니다. 다시 시도해주세요);
	boolean loginTry(String idIn, String pwIn) {
		final String ID = "admin", PW = "1234";	
		boolean isTrue = false;
		if(ID.equals(idIn)) {
			if(PW.equals(pwIn)) {
				System.out.println("로그인 되었습니다.");
				isTrue = true;
			} else {
				System.out.println("비밀번호를 틀리셨습니다. 다시 시도해주세요.");
			}
		} else {
			System.out.println("아이디를 틀리셨습니다. 다시 시도해주세요.");
		}
		
		return isTrue;
	}
	
	
}
