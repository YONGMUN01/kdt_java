package section05;

public class Practice03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("짝수의 합은 " + sum + "입니다.");
		
		
	}
}
