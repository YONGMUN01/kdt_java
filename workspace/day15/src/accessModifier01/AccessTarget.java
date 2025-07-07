package accessModifier01;

public class AccessTarget {

	public AccessTarget() {
		System.out.println("public 생성자");
	}

	protected AccessTarget(String str) {
		System.out.println("protected 생성자 : " + str);
	}
	
	AccessTarget(int num){
		System.out.println("default 생성자 : " + num);
	}
	
	private AccessTarget(double num) {
		System.out.println("private 생성자 : " + num);
	}
	
	//메소드
	public void publicMethod() {
		System.out.println("public 메소드");
	}
	protected void protectedMethod() {
		System.out.println("protected 메소드");
	}
	 void defaultMethod() {
		System.out.println("default 메소드");
	}
	private void privateMethod() {
		System.out.println("private 메소드");
	}
	

}
