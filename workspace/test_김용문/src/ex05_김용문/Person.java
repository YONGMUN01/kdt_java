package ex05_김용문;

public class Person {
	
	
	// 이름 변수 선언
	// 기본 생성자 생성
	// 매개변수 1개인 생성자 생성
	// 이름 리턴해주는 메소드 생성
	String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}

}
