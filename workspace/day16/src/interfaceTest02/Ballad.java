package interfaceTest02;
//9번 : 인터페이스, 참조변수의 다형성(캐스팅) 연습
public class Ballad implements Music{
	// 자식 클래스 Ballad, Hiphop, Rock 클래스
	// 발라드 클래스
	// "발라드 모드"를 출력하는mode 구현
	// "오직 발라드만 실행" 출력하는 onlyBallad메소드 만들기

	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}

	void onlyBallad() {
		System.out.println("오직 발라드만 실행");
	}
	
}
