package review;

public class A {

	String name;
	int age;
	String species;
	
	void eat(String food) {
		System.out.println(name + "이/가 " + food + "를/을 먹습니다.");
	}
	
	void sleep(String place) {
		System.out.println(name + "이/가 " + place + "에서 잠을 잡니다.");
	}
	
	void printBirthday() {
		System.out.println(name + "의 " + age + "번째 생일을 축하합니다.");
	}
	
}
