package homework08;

public class Gugudan04 {
	public static void main(String[] args) {
		
		// 로직 구성
		// 2) 숫자 변수 2개 선언
		// 1) while(num1 != 10)
		// 2)	num2 = 1;
		// 3)
		
		
		
		int num1 = 0, num2 = 1;
		while(num1 != 10) {
			num2 = 1;
			while(num2 != 10) {
				if(num1 == 0) {
					System.out.print(num2+ "단\t\t");
				} else {
					System.out.print(num2 + " X " + num1 + " = " + (num1 * num2) + "\t");
				}
				num2++;
			}
			System.out.println();
			num1++;
		}
		
	}
}
