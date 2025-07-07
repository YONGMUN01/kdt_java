package casting04;

public class IronMan extends Hero{
	
	public IronMan(String name) {
		super(name);
	}

	@Override
	void superPower() {
		System.out.println(this.getName() + "이/가 수트를 입고 날아다닙니다");
	}
	
	
	
	
	
}
