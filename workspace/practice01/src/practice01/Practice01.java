package practice01;

public class Practice01 {
	public static void main(String[] args) {

		int star = 5;
		boolean reverse = false;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - star) / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if(star == 1) {
				reverse = true;
			}
			if(reverse == false) {
				star -= 2;
			} else {
				star += 2;
			}
			System.out.println();
		}

	}
}
