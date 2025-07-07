package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		
		// 3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		// 로직 구성
		// 1) 입력클래스 선언, import
		// 2) 길이가 3인 배열 선언, 평균, 합 변수 선언 및 초기화
		// 3) 입력메시지 출력
		// 4) for(i = 0; i < 3; i++
		// 4-1)		syso(입력i)
		// 4-2)		배열[i] = 입력 값 
		// 4-3)		합 += 배열[i]
		// 5) 평균 = 합 / 3;
		// 6) 출력
		// 7) 스캐너 종료
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int sum = 0, average = 0;
		
		System.out.println("3명의 수학점수를 입력하시오.");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("점수" + i + ": ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		average = sum / arr.length;
		
		System.out.println("평균은 " + average + "입니다.");
		
		sc.close();
	}
}
