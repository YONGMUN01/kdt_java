package change;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Change {
	private int money = 0;
	private int price = 0;
	private int change = 0;
	private int thousand = 0;
	private int fiveHundred = 0;
	private int hundred = 0;

	public Change() {
	}

	private int readNumber() {
		Scanner sc = new Scanner(System.in);	// Scanner를 닫을 방법을 아직 모르겠다 * 나중에 다시 수정해보기
		int number = sc.nextInt();
		return number;
	}
	
	// 가격 setter
	public void setPrice() {
		try {
			System.out.print("물건 값 : ");
			this.price = readNumber();
			if(this.price < 0) {
				System.out.println("양수를 입력해주세요.");
				setPrice();
			}
		} catch(InputMismatchException e) {
			System.out.println("제대로 된 값을 입력해주세요.");
			setPrice();
		}
	}

	// 지불 금액 setter
	public void setMoney() {
		try {
			System.out.print("지불 금액 : ");
			this.money = readNumber();
			if(this.money < 0) {
				System.out.println("양수를 입력해주세요.");
				setMoney();
			}
		} catch (InputMismatchException e) {
			System.out.println("제대로 된 값을 입력해주세요.");
			setMoney();
		} 
		
	}
	
	private void thousand() {
		this.thousand = this.change / 1000;
		this.change %= 1000;
		System.out.println("1000원 : " + this.thousand);
	}
	
	private void fiveHundred() {
		this.fiveHundred = this.change / 500;
		this.change %= 500;
		System.out.println("500원 : " + this.fiveHundred);
	}
	
	private void hundred() {
		this.hundred = this.change / 100;
		this.change %= 100;
		System.out.println("100원 : " + this.hundred);
	}
	
	public void result() {
		setPrice();
		setMoney();
		this.change = this.money - this.price;
		if(this.change < 0) {
			System.out.println("지불하신 금액이 부족합니다.");
			result();
		}else {
			thousand();
			fiveHundred();
			hundred();
		}
	}
	

}
