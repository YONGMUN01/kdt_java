package homework08;

public class ArrayTask01 {
	public static void main(String[] args) {
		
		// 1. 100~1까지의 값을 배열에 넣고 출력
		// 1) 길이가 100인 배열 선언
		// 2) for문(int i = 0; i < 100; i++)
		// 2-1)		배열[i] = 100 - i;
		// 		}
		// 3) for문(int i = 0; i < 100; i++)
		// 3-1)		syso(배열[i]);
		//		}
		
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
