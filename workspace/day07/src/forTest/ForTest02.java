package forTest;

//import java.util.stream.IntStream;

// 5번 : for문
public class ForTest02 {
	public static void main(String[] args) {
		
		// 1부터 100까지 수 중에서 짝수만 출력
		// 초기식 int i = 2
		// 조건식 i <= 100
		// 증감식 i++
		// {if( i % 2){
		//		syso(i)
		//}}
		
		// 1) for문과 if문 사용
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		// 2) for문의 조건식을 50으로 사용
		for(int i = 0; i < 50; i++) {
			System.out.print((i + 1) * 2 + " ");
		}
		
		System.out.println();
		// 3) for문의 초기식을 2로 사용하여 증감식 변경
		for(int i = 2; i <= 100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1부터 100까지의 수 중에서 짝수의 합만 구하기
		// 1) 총 합 구할 변수 선언	방법1)			방법2)			방법3)
		// 2) for문	초기식		int i = 1		int i = 1		
		//			조건식		i <= 100
		//			증감식		i++
		// { if문 (i % 2 == 0)	변수 += i;}
		// 3) 최종 출력 짝수의 합 : 
		
		// 방법1)
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수의 총합1 : " + sum);
		
		// 방법2)
		int total = 0;
		for(int i = 1; i <= 50; i++) {
//			System.out.println();
			total += i * 2;
		}
		System.out.println("짝수의 총합2 : " + total);
		
		
		// 방법3)
		int total2 = 0;
		for(int i = 2; i <= 100; i += 2) {
			total2 += i;
		}
		System.out.println("짝수의 총합3 : " + total2);
		
		int num = 50;
		int sum2 = 2 * (num * (num + 1)) / 2;
		System.out.println("짝수의 총합4 : " + sum2);
		
//		// 방법5)
//		int sum3 = IntStream.rangeClosed(1,  100).filter(i -> i % 2 == 0).sum();
//		System.out.println("짝수의 총합5 : " +sum3);
	}
}
