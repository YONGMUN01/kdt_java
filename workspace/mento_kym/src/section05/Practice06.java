package section05;

public class Practice06 {
	public static void main(String[] args) {
		
		int count = 1;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 6; j - (i * 2) > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < count; j++) {
				System.out.print("* ");
			}
			count += 2;
			System.out.println();
		}
		
	}
}
