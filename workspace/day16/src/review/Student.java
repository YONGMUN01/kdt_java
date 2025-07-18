package review;

public class Student extends Person{
	
	// 필드
	private boolean stu;

	public Student(String name, boolean stu) {
		super(name);	// 부모의 생성자
		this.stu = stu;
	}
	
	// boolean의 필드일 경우 setter, getter 생성 시 is + 필드명
	public boolean isStu() {
		return stu;
	}

	// 메소드 오버라이딩
	@Override
	void introduce() {
		System.out.println(super.getName() + "은 학생입니다.");
	}
	
	// 자식클래스 메소드 추가
	void study() {
		System.out.println(getName() + "이/가 공부합니다.");
	}
	
	
	
}
