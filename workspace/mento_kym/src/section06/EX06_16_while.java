package section06;

import java.util.Scanner;

public class EX06_16_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] lotto = {{2, 6, 11, 33, 42, 44},
				{1, 6, 17, 22, 24, 33},
				{7, 16, 24, 33, 42, 44},
				{11, 27, 32, 34, 43, 46},
				{6, 17, 22, 24, 33, 41}
		};
		
		String number = "";
		boolean isTrue = false;
		
		System.out.print("당첨 숫자 6개를 연속으로 입력해주세요. >>");
		String myNum = sc.nextLine();
		int i = 0;
		int j = 0;
		while(i < lotto.length) {
			while(j < lotto[i].length) {
				number += lotto[i][j];
				j++;
			}
			if(number.equals(myNum)) {
				isTrue = true;
				break;
			} 
			j = 0;
			i++;
			number = "";
		}
		if(isTrue == true) {
			System.out.println(myNum + "은 당첨입니다");
		} else {
			System.out.println(myNum + "은 당첨되지 못했습니다.");
		}
		
		
		
		
		
	}
}
