package casting03;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	void crying() {
		System.out.println("야옹~");
	}

}
