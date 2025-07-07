package inheritanceConstructor;
// 3번 : 상속관계 - 생성자 확인
public class Parents {
	int number;

	// 생성자
	public Parents() {
		super();	// 부모클래스의 생성자, 모든 클래스의 부모클래스 Object 클래스!!
		System.out.println("Parents 생성자 호출");
	}
	
	
	public Parents(int number) {
		super();
		this.number = number;
	}

	// 메소드
	void printStr(String str) {
		System.out.println("부모 클래스에서 메소드 호출 : " + str);
	}
}
