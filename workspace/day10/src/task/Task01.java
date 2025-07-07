package task;

import java.util.Scanner;

public class Task01 {
	// 1. 문자열 속의 단어를 공백 기준으로 세기
	// 메소드명 : countWord
	// 매개변수 : String str
	// ex) I love java => 3개
	// ex) 안녕하세요 저는 김용문입니다 java 공부 중입니다 => 6개
	// 1) 정수형 리턴타입, countWord 메소드명, 문자열 매개변수
	// 2) 문자형 배열 선언, count 정수형 변수 선언
	// 3) for(i = 0; i < str.length(); i++
	//		배열[i] = str.charAt(i);
	//		if(배열[i] == '\t')
	//			count++
	// 4) return count + 1;
	int countWord(String str) {
		char[] arr = new char[str.length()];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if(arr[i] == ' ') {
				count++;
			}
		}
		return count + 1;
	}
	
	// 2. 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 1, 3 => 남자, 2, 4 => 여자
	// 1) void 리턴타입, 메소드명 getGender, 문자열 매개변수
	// 2) 문자형 배열 선언
	// 3) for i = 0; i < 14; i++
	//		배열 = 매개변수.charAt(i);
	// 4) if(배열[7] == 1 || 배열[7] == 3)
	//			남성입니다 출력
	// 5) if(배열[7] == 2 || 배열[7] == 4)
	//			여성입니다 출력
	void getGender(String id) {
		char[] arr = new char[id.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = id.charAt(i);
		}
		if(arr[7] == '1' || arr[7] == '3') {
			System.out.println("남성입니다.");
		} if(arr[7] == '2' || arr[7] == '4') {
			System.out.println("여성입니다.");
		} 
	}
	
	
	// 3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 평균 구하여(정수형)
	//						각 학생별 학점 구하기
	// 메소드명 : getGrade
	// 95점 이상 A+,
	// 90점 이상 A
	// 85점 이상 B+
	// 80점 이상 B
	// 75점 이상 C+
	// 70점 이상 C
	// 69점 이하 F
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task01 task = new Task01();
		
		// 1.
		System.out.print("문장을 입력하시오 : ");
		System.out.println("문자의 개수는 : " + task.countWord(sc.nextLine()));
		
		
		// 2.
		System.out.print("주민등록번호를 입력하시오 : ");
		task.getGender(sc.nextLine());
		
	}
	
}
