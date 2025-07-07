package twoForTest;

public class Gugudan02 {
	public static void main(String[] args) {
		
		// 로직 구성
		// 1) for문( int i = 0; i < 10; i++){
		// 2)		for문(int j = 2; j < 10; j++){
		// 2-1) 		if(i == 0)
		// 2-2)				syso(j단	\t\t)
		// 2-3)			else
		// 2-4)				syso(j * i =  \t)
		//			}
		//			syso
		//		}
		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 2; j < 10; j++) {
//				if(i == 0) {
//					System.out.print(j + "단\t\t");
//				}
//				else
//					System.out.print(j + " X " + i + " = " + (i * j) + "\t");
//			}
//			System.out.println();
//		}
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(i == 0 ? j + "단\t\t" : j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
			
		}
	}
}
