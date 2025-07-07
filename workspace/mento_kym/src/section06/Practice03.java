package section06;

public class Practice03 {
	
	static int[] randomNumber() {
		int[] random = new int[10];
		boolean isSame = false;
		
		random[0] = (int)((Math.random() * 100) + 1);
		
		for(int i = 1; i < 10; i++) {
			random[i] = (int)((Math.random() * 100) + 1);
			for(int j = 0; j < i; j++) {
				if(random[j] == random[i]) {
					isSame = true;
				}
			}
			if(isSame == true) {
				i--;
				isSame = false;
			}
		}
		
		return random;
	}
	
	public static void main(String[] args) {
		int[] random = new int[10];
		random = Practice03.randomNumber();
		
		for(int i = 0; i < random.length; i++) {
			System.out.println((i + 1) + "번째 카드 : " + random[i]);
		}
	}
}
