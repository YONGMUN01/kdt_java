package homework08;

import java.util.Scanner;

public class ArrayTask08 {
	public static void main(String[] args) {
		
		// 8. 5개의 정수를 입력받은 뒤 그 값을 배열에 담고 최대값과 최소값 출력
		// 로직 구성
		// 1) 입력클래스 선언, import
		// 2) 입력메시지 요구 출력
		// 3) 길이가 5인 배열 선언, 최대값, 최소값 변수 선언
		// 3) for(i = 0; i < 5; i++)
		// 3-1)		입력 메시지 출력
		// 3-2)		배열[i] = 입력 값
		// 4)		if(i == 0)
		// 4-1)			max = 배열
		// 4-2)			min = 배열
		// 5)		if(배열 >= max)
		// 5-1)			max = 배열
		// 6)		if(배열 <= min)
		// 6-1)			min = 배열
		// 7) 출력
		// 8) 스캐너 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력해주세요");
		int[] arr = new int[5];
		int max = 0, min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자 " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
			if(i == 0) {
				max = arr[i];
				min = arr[i];
			}
			if(arr[i] >= max) {
				max = arr[i];
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		sc.close();
		
	}
}
