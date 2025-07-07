package twoArray;
// 4번 : 2차원 배열과 for문, for-each문
public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[][] ar1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
		
		System.out.println(ar1.length);
		System.out.println(ar1[0].length);
		
		System.out.println(ar1);	// 2차원 배열의 전체 시작주소값
		System.out.println(ar1[0]);	// 2차원 배열의 0행의 시작주소값
		System.out.println(ar1[1]);	// 2차원 배열의 1행의 시작주소값
		System.out.println(ar1[2]);	// 2차원 배열의 2행의 시작주소값
		System.out.println(ar1[3]);	// 2차원 배열의 3행의 시작주소값
//		System.out.println(ar1[4]);	// 2차원 배열의 3행까지만 있으므로 인덱스 범위 벗어나 오류 발생
		
		System.out.println(ar1[0][0]);	// 1
		System.out.println(ar1[0][1]);	// 2
//		System.out.println(ar1[0][2]);
		System.out.println(ar1[1][0]);	// 3
		System.out.println(ar1[1][1]);	// 4
		System.out.println(ar1[2][0]);	// 5
		System.out.println(ar1[2][1]);	// 6
		
		System.out.println("=====================");
		for(int i = 0; i < ar1.length; i++) {
			// i는 행의 인덱스 번호
//			System.out.println(i);
//			System.out.println(ar1[i]);
			for(int j = 0; j < ar1[i].length; j++) {
				System.out.print(ar1[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] ar2 = {{1, 2, 3}, {4, 5}, {6}};
		
		for(int [] data : ar2) {
			System.out.println(data);
			for(int value : data) {
				System.out.print(value);
			}
			System.out.println();
		}
		
	}
}
