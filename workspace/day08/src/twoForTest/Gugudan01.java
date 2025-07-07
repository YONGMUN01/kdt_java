package twoForTest;

public class Gugudan01 {
	public static void main(String[] args) {
		
		// 로직구성
		// 1) 바깥 for문 (int i = 2; i < 10; i++){
		// 1-1)		syso(i + "단");
		// 2)		안쪽 for문(int j = 1; j < 10; j++){
		// 2-1)			syso(i + " X " + j + " = " + (i * j));
		//			}
		//		}
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
