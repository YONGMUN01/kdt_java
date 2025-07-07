package abstractTest01;
// 4번 : 일반 클래스와 추상 클래스 객체화
public class AbstractTest {
	public static void main(String[] args) {
		// 일반클래스 ClassA 객체화
		ClassA a = new ClassA();
		System.out.println(a);
		a.method1();
		
		// 추상클래스 ClassB 객체화 - 미완성된 클래스
//		Class B b = new ClassB();
		
		// 추상클래스 ClassB를 상속받은 일반 클래스 classc 객체화
		ClassC c = new ClassC();
		System.out.println(c);
		c.method1();	// 추상클래스에 정의된 추상메소드, ClassC에서 재정의
		c.method2();
		c.printNumber();
		
		ClassB b = new ClassC();
		System.out.println(b);	// 오버라이딩 된 메소드
		b.method1();
		// 다운 캐스팅
		((ClassC)b).printNumber();
		
	}
}
