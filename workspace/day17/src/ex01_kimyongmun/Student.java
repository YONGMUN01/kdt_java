package ex01_kimyongmun;

public class Student extends Person{
//	Student클래스
//	   필드 : 점수(접근제한자 private)
//	   생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
//	   점수계산메소드 오버라이딩 => 학생이름의 점수는 몇점입니다 출력
	
	// 필드
	private int score;

	// 생성자
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	// getter
	public int getScore() {
		return this.score;
	}

	// 메소드
	@Override
	public void score() {
		System.out.println(getName() + "님의 점수는 " + this.score + "점 입니다.");
	}
	
	

}
