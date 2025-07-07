package homework08;

public class ArrayTask06 {
	public static void main(String[] args) {
		
		// 6. A ~ F까지 중 C만 제외하고 배열에 담아 출력	67
		// 로직 구성
		// 1) 길이가 5인 배열 선언
		// 2) 값이 65인 변수 선언
		// 3) for(int i = 0; i < 25; i++)
		// 3-1)		배열[i] = 65변수 + i
		// 3-2)		if(i + 65변수 == 67)
		// 3-3)			65변수++
		// 3-4)			배열[i] = 65변수 + i;
		// 4) for(int i = 0; i < 25; i++)
		// 4-1)		syso(배열[i])
		
		
		char[] arr = new char[5];
		int num = 65;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(num + i);
			if(num + i == 67) {
				num++;
				arr[i] = (char)(num + i);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
