package ex04_김용문;

public class ForGugudan {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " X " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		
	}
}
