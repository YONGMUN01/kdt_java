package returnAge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Profile {

	private String name;
	private int age;
	Scanner sc = new Scanner(System.in);

	private void setName() {
		System.out.print("이름 입력 : ");
		this.name = sc.next();
	}

	private int readNumber() {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("나이를 제대로 입력해주세요. \n나이 입력 : ");
				sc.next();	// 잘못된 입력 제거
				
				// sc.next() 입력하기 전에는 20줄에 값이 계속 남아있어서
				// 무한반복이 일어남
				// 잘못된 값을 삭제하기 위해 sc.next()를 사용
			}
		}
	}

	private void setAge() {
		while (true) {
			System.out.print("나이 입력 : ");
			this.age = readNumber();
			if (this.age < 0) {
				System.out.println("나이를 제대로 입력해주세요.");
			} else {
				break;
			}
		}
	}

	private void present() {
		System.out.println(this.name + "님의 내년 나이는 " + (this.age + 1) + "입니다.");
	}

	private void internationalAge() {
		System.out.println(this.name + "님의 만 나이는 " + (this.age - 1) + "입니다.");
	}

	public void result() {
		setName();
		setAge();
		present();
		internationalAge();
	}

}
