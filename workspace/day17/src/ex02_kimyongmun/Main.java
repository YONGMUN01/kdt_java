package ex02_kimyongmun;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account account = new Account();
		int choice = 0;

		while (true) {

			System.out.print("메뉴를 선택해주세요." + "\n1. 출금   " + "2. 입금   " + "3. 잔액 조회   " + "4. 종료" + "\n입력 : ");
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("이상한 값을 입력하셨습니다.");
				e.printStackTrace();
				System.out.println(e.getMessage());
			} 

			if (choice == 1) {
				try {
					System.out.print("금액을 입력해주세요 : ");
					try {
						account.withdraw(sc.nextInt());
					} catch (InputMismatchException e) {
						System.out.println("이상한 값을 입력하셨습니다.");
					}
				} catch (NumberFormatException e) {
					System.out.println("금액이 부족합니다.");
				} catch (InputMismatchException e) {
					System.out.println("이상한 값을 입력하셨습니다.");
				}
			} else if (choice == 2) {
				System.out.print("금액을 입력해주세요 : ");
				account.deposit(sc.nextInt());
			} else if (choice == 3) {
				System.out.println("현재 잔액 : " + account.getBalance());
			} else if (choice == 4) {
				System.out.println("시스템을 종료하겠습니다.");
				break;
			} else {
					System.out.println("다시 입력해주세요.");
			}

		}
	}
}
