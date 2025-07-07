package task01;

public class Student extends Person{
	// 필드
	String studentId;
	String major;

	// 기본 생성자
	public Student() {
		this("이름없음", 0, "값 없음", "전공없음");
	}

	// 매개변수가 4개 있는 생성자
	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
		System.out.println("Student 생성자 호출");
	}

	// 부모 클래스의 introduce 메소드 오버라이딩
	// 메소드 오버라이딩
	@Override
	void introduce() {
		super.introduce();
		System.out.println("학번 : " + this.studentId + ", 전공 : " + this.major);
	}
	
	
	
	
	
	
	
	
	
	
	
}
