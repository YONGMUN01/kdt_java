package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {
		
		// 2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		// 로직 구성
		// 1) 길이가 10인 배열 선언
		// 2) 합을 저장할 변수 선언 및 초기화
		// 3) for(int i = 0; i < 10; i++)
		// 3-1)		배열[i] = i + 1;
		// 3-2)		합 변수 += 배열[i];
		//		}
		// 4) syso(합 변수)
		
		int [] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}
}
