package section05;

public class EX05_04_reverse {
	public static void main(String[] args) {
		for(int i = 7; i > 0 ; i--) {
			for(int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
