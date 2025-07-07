package methodTest;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MethodTask mt = new MethodTask();
		// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeSign
		System.out.println(mt.changeSign(10));
		
		
		// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : printName
		String name = mt.printName("김용문", 3);
		System.out.println(name);
		
		// 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		// 매개변수o, 리턴값o
		// 메소드명 : changeNumber
		System.out.print("변경할 숫자를 입력하세요 : ");
		System.out.println(mt.changeNumber(sc.nextInt()));
		
		// 4. 5개의 정수 중 평균을 반환하는 메소드
		// 매개변수o(배열), 리턴값o
		// 메소드명 : getAvg
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("평균값을 구할 정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(mt.getAvg(arr));
		sc.nextLine();
		
		// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		// 매개변수o(배열), 리턴값x
		// 메소드명 : printMinMax
		
		System.out.println("{2, 5, 6, 23, 8, 33, 9, 6}들 중 최대값, 최소값");
		int[] arr2 = {2, 5, 6, 23, 8, 33, 9, 6};
		mt.printMinMax(arr2);
		
		// 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
		// 예시) BanAnA => bANaNa
		// 메소드명 : changeCase
		// 매개변수와 반환값은 자유 => 단, 형변환 이용할것!
		System.out.print("변환할 문장을 입력하세요");
		String msg = sc.nextLine();
		System.out.println(mt.changeCase(msg));
		
		// 7. 아이디와 비밀번호를 입력받아 로그인하기
		// 매개변수o, 리턴값o(리턴타입 boolean)
		// 메소드명 : login
		// main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
		// 둘중 하나라도 틀리면 다시 확인하세요 출력
		System.out.println("아이디와 비밀번호를 입력하세요. : ");
		boolean isTrue = false;
		isTrue = mt.login(sc.next(), sc.next());
		if(isTrue == true) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인에 실패하셨습니다.");
		}
		
		sc.close();
	}
	
	// 1.
	// 1) 리턴타입과 메소드명, ()에 들어갈 매개변수 정하기
	// 2) ~매개변수 + 1 로 음수를 양수로 양수를 음수로 변환한 값 반환
	int changeSign(int num) {
		return ~num + 1;
	}
	
	// 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	// 1) 문자열 리턴타입, 메소드명 printName, 문자열 매개변수, 정수형 매개변수
	// 2) for문 초기식 i = 0; i< 정수형 매개변수; i++
	// 2-1)		syso(문자열 매개변수);
	// 3) 이름과 정수 값 반환
	String printName(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(name);
		}
		
		return "이름 : " + name + ", 정수 : " + num;
	}
	
	
	// 3.
	// 1) 정수형 리턴타입, 메소드명 changeNumber, 정수형 매개변수
	// 2) 삼항연산자를 통해 값 리턴
	int changeNumber(int num) {
		return (num > 10 ? 100 : 1);
	}
	
	// 4. 
	// 1) 실수형 리턴타입, 메소드명 getAvg, 정수형 배열 매개변수
	// 2) 총합을 저장할 변수 선언
	// 3) for 초기식 i = 0; i < arr.length; i++
	//		총합 += arr[i]
	// 4) 총합 / arr.length 값 리턴
	double getAvg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / (double)arr.length;
	}
	
	// 5.
	// 1) void리턴타입, 메소드명 printMinMax, 정수형 배열 매개변수
	// 2) 배열 정렬
	// 3) 최대값 배열[arr.length-1], 최소값 배열[0] 출력
	void printMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("최대값 : " + arr[arr.length - 1] + ", 최소값 : " + arr[0]);
	}
	
	// 6. 
	// 1) 문자열 리턴타입, 메소드명 changeCase, 문자열 매개변수
	// 2) 정수형 배열 선언 배열[문자열 길이]으로 초기화, 결과 변수
	// 3) for문으로 배열에 문자열값 대입
	// 3) for문 초기식 i = 0; i < 배열.length; i++
	//		arr[i] = arr[i] >= 97 ? arr[i] - 32 : arr[i] + 32;
	// 4)	결과변수 += arr[i];
	// 5) 결과변수 반환
	String changeCase(String name) {
		int[] arr = new int[name.length()];
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = name.charAt(i);
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] >= 97 ? arr[i] - 32 : arr[i] + 32;
			result += (char)arr[i];
		}
		return result;
		
	}
	
	// 7. 아이디와 비밀번호를 입력받아 로그인하기
	// 1) 논리형 리턴타입, 메소드명 login, 문자열 매개변수 2개
	// 2) 아이디, 비밀번호 상수 선언, 논리형 변수 선언
	// 3) 		if문(아이디.equals(아이디 매개변수))
	// 3-1)			if(비밀번호.equals(비밀번호 매개변수))
	// 3-1-1)			syso(로그인 되었습니다)
	// 3-1-2)			논리형 변수 = true
	// 3-2)			else
	// 3-2-1)				syso(비밀번호를 틀리셨습니다.);
	// 4)		else
	// 4-1)			syso(아이디를 틀리셨습니다.);
	// 5) 논리형 변수 값 반환
	boolean login(String idIn, String pwIn) {
		final String ID = "admin", PW = "1234";
		boolean isTrue = false;
		if(ID.equals(idIn)) {
			if(PW.equals(pwIn)) {
				System.out.println("로그인 되었습니다.");
				isTrue = true;
			} else {
				System.out.println("비밀번호를 틀리셨습니다.");
			}
		} else {
			System.out.println("아이디를 틀리셨습니다.");
		}
		
		return isTrue;
	}
	
}
