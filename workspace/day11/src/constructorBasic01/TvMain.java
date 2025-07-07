package constructorBasic01;

public class TvMain {
	public static void main(String[] args) {
		Tv myTv = new Tv(10, 5, "black", "LG");
//		myTv.brand = "LG";
//		myTv.color = "black";
//		myTv.ch = 10;
//		myTv.vol = 5;
		
		System.out.println(myTv.brand + "TV를 조작합니다");
		System.out.println(myTv.color + "색상 tv의 채널은" + myTv.ch);
		myTv.nextChannel();
		myTv.powerOnOff();
		myTv.nextChannel();
		myTv.decreaseVolume();
		
		Tv myTv2 = new Tv();
		myTv2.brand = "samsung";
		myTv2.color = "red";
		myTv2.ch = 100;
		myTv2.vol = 50;
		
		System.out.println(myTv2.brand + "TV를 조작합니다.");
		System.out.println(myTv2.power);
		myTv2.nextChannel();
		myTv2.powerOnOff();
		myTv2.nextChannel();
		myTv2.increaseVolume();
		
		
	}
}
