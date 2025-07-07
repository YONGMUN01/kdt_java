package homework08;

public class ArrayTask07 {
	public static void main(String[] args) {
		
		// 7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력(char만 사용, 선언없이)
		// 로직 구성
		// 1) 길이가 26인 문자형 배열 선언
		// 2) for(int i = 0; i < 26; i++)
		// 2-1)		if(i % 2 == 0)
		// 2-1-1)		arr[i] = i +'a'
		// 2-2)		else
		// 2-2-1)		arr[i] = i + 'A'
		// 3) for(int i = 0; i < 26; i++)
		// 3-1)		syso(배열)
		
		char[] arr = new char[26];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = (char)(i + 'a');
			} else
				arr[i] = (char)(i + 'A');
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
