package anonymousTest;
// 2번 : 익명클래스 이용한 객체화
public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new Animal() {

			@Override
			public void speak() {
				System.out.println("야옹");
			}
			
		};	// 내부클래스 중괄호 끝
		System.out.println(cat);
		// anonymousTest.AnimalMain$1@2ff4acd0
		//		패키지명.		클래스명$	내부클래스1 익명클래스
		
		Animal dog = new Animal() {

			@Override
			public void speak() {
				System.out.println("멍멍");
			} 
			
		};	// 내부 클래스 중괄호 끝
		System.out.println(dog);
		
		cat.speak();
		dog.speak();
	}
}
