package review;

class Animal {

	String name;
	int age;
	String species;
	
	void eat(String food) {
		System.out.println(name + "이/가 " + food + "를/을 먹습니다.");
	}
	
	void sleep(String place) {
		System.out.println(name + "이/가 " + place + "에서 잠을 잡니다.");
	}
	
	void printBirthday() {
		System.out.println(name + "의 " + age + "번째 생일을 축하합니다.");
	}
	
}

public class Task02 {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		System.out.println(dog);
		dog.name = "멍멍이";
		dog.age = 1;
		dog.species = "시츄";
		System.out.println(dog.name);
		dog.printBirthday();
		
		Animal cat = new Animal();
		cat.name = "빵빵이";
		cat.age = 3;
		cat.species = "코숏";
		System.out.println(cat.name);
		System.out.println(cat.age);
		cat.eat("츄르");
		
		
	}
}
