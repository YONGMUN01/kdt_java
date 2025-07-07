package section06;

import java.util.Scanner;

public class EX06_16 {
	public static void main(String[] args) {
		
		int[][] lotto = {{2, 6, 11, 33, 42, 44},
				{1, 6, 17, 22, 24, 33},
				{7, 16, 24, 33, 42, 44},
				{11, 27, 32, 34, 43, 46},
				{6, 17, 22, 24, 33, 41}
		};
		
		Scanner sc = new Scanner(System.in);
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요. >>");
		myNum = sc.next();
		
		boolean isWin = false;
		
		for(int i = 0; i < lotto.length; i++) {
			String lottoNumber = "";
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
		}
		
		if(isWin) {
			System.out.println(myNum + " 번호 당첨!!");
		}else {
			System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
		}
		sc.close();
	}
}
