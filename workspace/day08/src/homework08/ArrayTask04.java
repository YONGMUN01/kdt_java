package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
		
		// 4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		// 로직 구성
		// 1) 길이가 8인 배열 선언
		// 2) for(int i = 0; i < 2; i++
		// 3)		for(int j = 0; j < 4; j++
		// 3-1)			배열[(i * 4) + j] = j;
		// 4) for(int i = 0; i < 8; i++)
		// 5) 출력
		
		int[] arr = new int[8];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				arr[(i * 4) + j] = j;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
