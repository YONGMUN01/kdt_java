package inheritanceTest02;
// 2번 : 상속 기초
public class Animal {
	// 필드
	String name;
	int age;
	String type;
	
	// 생성자
	public Animal() {
		super();
	}
		
	// 메소드
	void eat(String food) {
		System.out.println(this.name + "이/가 " + food + "을/를 먹고 싶습니다." );
	}
	
	void sleep(int time, String place) {
		System.out.println(this.name + "이/가 " + time + "시에 " + place + "에서 잠을 잡니다.");
	}
	
}
