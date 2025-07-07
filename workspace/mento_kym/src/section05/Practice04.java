package section05;

public class Practice04 {
	public static void main(String[] args) {
		int cycle = 1;
		int num1 = 0;
		int num2 = 0;
		boolean isSame = false;
		
		while(true) {
			num1 = (int)((Math.random() * 6) + 1);
			num2 = (int)((Math.random() * 6) + 1);
			
			System.out.println(cycle + "번째 -> 주사위1 : " + num1 + ", 주사위2 : " + num2);
			if(num1 == num2) {
				isSame = true;
				break;
			}
			cycle++;
		}
		if(isSame == true) {
			System.out.println("반복횟수 : " + cycle + ", 주사위 숫자 : " + num1);
		}
		
		
	}
}
