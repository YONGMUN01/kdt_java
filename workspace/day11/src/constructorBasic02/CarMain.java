package constructorBasic02;

class Car{
	
	String brand;
	int speed;
	public Car(String brand) {
		this.brand = brand;
	     for(int i = 0; i <= 10; i++) {
	         this.speed += 1;
	         System.out.println(this.speed);
	      }
		System.out.println("생성자 호출 : " + this);	// @279f2327
	}
	
	
	// 매개변수의 타입이 다르다 => 생성자 오버로딩
	public Car(int speed) {
		this.speed = speed;
	}


	// 매개변수가 개수가 다르다 => 생성자 오버로딩
	public Car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	
	// 매개변수의 순서가 다르다 => 생산자 오버로딩
	public Car(int speed, String brand) {
		this.brand = brand;
		this.speed = speed;
	}


	// 메소드
	void printInfo() {
		System.out.println("모델 : " + this.brand);
		System.out.println("속도 : " + this.speed);
	}
	
}



public class CarMain {
	public static void main(String[] args) {
		
		Car car1 = new Car("BMW");
		System.out.println(car1);	// @279f2327
		car1.printInfo();
		
		Car car2 = new Car("기아");
		System.out.println(car2);
		
	}
}
