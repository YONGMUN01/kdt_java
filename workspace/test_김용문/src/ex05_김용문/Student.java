package ex05_김용문;

public class Student extends Person {

	
	// 자바점수, dbms 점수, html 점수 정수형 변수 선언
	// major 객체 생성
	// 기본생성자 생성
	// 매개변수가 5개인 생성자 생성
	// 	Person 클래스의 매개변수가 1개인 생성자 오버라이딩
	// 	입력받은 매개변수 필드에 저장
	//  정수형 리턴값 총점 메소드 작성
	//  정수형 리턴값 평균 메소드 작성
	//  문자열 리턴값 major 메소드 작성
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;
	
	public Student() {
		super();
	}
	
	
	public Student(String name, String mj, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.major = major;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	
	int getTotalScore() {
		return this.javaScore + this.dbmsScore + this.htmlScore;
	}
	
	int getAverageScore() {
		return (this.javaScore + this.dbmsScore + this.htmlScore) / 3;
	}
	
	Major getMajor() {
		return major;
	}
}
