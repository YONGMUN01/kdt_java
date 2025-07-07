package anonymousTest;

public class AnonymousMain {
	public static void main(String[] args) {
		InterA a = new ClassA();
		System.out.println(a);
		a.printText();
		
		InterA aa = new InterA() {

			@Override
			public void printText() {
				System.out.println("익명클래스에서 오버라이딩");
				System.out.println("수업 끝");
			}
		};
		
		aa.printText();
		
	}
}
