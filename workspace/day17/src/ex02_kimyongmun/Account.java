package ex02_kimyongmun;

import java.util.InputMismatchException;

public class Account {
//	2. 은행 계좌 프로그램
//	은행계좌 클래스 : Account
//	필드 : 잔고 balance
//	출금 메소드 : withdraw 매개변수1개 => 잔액보다 출금 금액이 크다면 출금불가 예외 처리 / 현재 잔고는 0원입니다. 
//	            출금금액의 0원이 부족하여 출금이 불가합니다. 출력
//	입금 메소드 : deposit 매개변수1개 => 잔액에 입급된 금액 추가 후 입금된 금액은 0원입니다. 현재 잔고는 0원입니다 출력
//
//	=> 모든 예외처리는 메소드를 사용하는 쪽으로 던지기

	// 필드
	private int balance = 10000;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	// 메소드
	public void withdraw(int money) throws NumberFormatException, InputMismatchException{
		if(balance < money) {
			System.out.println("출금금액의 " + (money - balance) + "원이 부족하여 출금이 불가합니다.");
			throw new NumberFormatException();
		}
		System.out.println("현재 잔고는 " + (balance - money) + "원 입니다.");
		balance -= money;
	}
	
	public void deposit(int money) {
		System.out.println("입근된 금액은 " + money + "원 입니다.");
		System.out.println("현재 잔고는 " + (balance + money) + "원 입니다.");
		balance += money;
	}
	
}
