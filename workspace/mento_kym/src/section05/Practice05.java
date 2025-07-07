package section05;

public class Practice05 {
	public static void main(String[] args) {
		
		//   4		
		//  3 5		
		// 2 4 6	
		//1 3 5 7	
		
		for(int i = 0; i < 4; i++) {
			for(int j = 3; j - i > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i + 1) * 2; j++) {
				if(j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
