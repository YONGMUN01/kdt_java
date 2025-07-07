package homework08;

public class ArrayTask05 {
	public static void main(String[] args) {
		
		// 5. A ~ F까지를 배열에 값을 넣고 출력
		// 로직 구성
		// 1) 길이가 26인 문자 배열 선언
		// 2) for(int i =0; i < 26; i++)
		// 2-1)		arr[i] = (char)(i + 65);
		// 3) for(int i =0; i < 26; i++)
		// 3-1)		syso(배열[i[);
		
		char[] arr = new char[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)(i + 65);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
