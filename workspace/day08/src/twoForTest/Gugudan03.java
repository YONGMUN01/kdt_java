package twoForTest;

public class Gugudan03 {
	public static void main(String[] args) {
		
		// 로직구성
		// 1) for문 (int i = 1; i <= 3; i++){
		// 2)		for문(int j = 1; j <= 3; j++)
		// 2-1)			syso(i * j 단)
		// 3)		for문(int j = 1; j <= 3; j++)
		// 4)			for문(int k = 1; k <= 3; k++)
		// 4-1)				syso((k * j) X k = \t)
		
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print((i * 3) + j  + "단\t\t");
			}
			System.out.println();
			for(int j = 1; j <= 9; j++) {
				for(int k = 1; k <= 3; k++) {
					System.out.print((i * 3) + k + " X " + j + " = " + (((i * 3) + k) * j) + "\t" );
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
