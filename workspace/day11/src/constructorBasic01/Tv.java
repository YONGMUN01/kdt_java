package constructorBasic01;
// 1번 : 생성자 기초
public class Tv {
	// 필드
	// 채널, 볼륨, 전원, 색상, 브랜드
	boolean power;	// 기본값 false
	int ch;
	int vol;
	String color;
	String brand;
	
	// 생성자		alt + shift + s + o
	// 기본 생성자 => 개발자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성한다
	public Tv() {
		
	}

	
	// 매개변수가 4개 있는 생성자
	public Tv(int ch, int vol, String color, String brand) {
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}
	
	
	
	
	
	
	







	// 메소드
	// 전원이 꺼져있으면 키고, 켜져있으면 끄는 메소드
	// 메소드명 : powerOnOff()
	void powerOnOff() {
		// 전원이 켜져있으면 끈다
		power = !power;
		System.out.println("전원상태 : " + (power ? "켜짐" : "꺼짐"));
//		if(!power) {
//			System.out.println("전원상태 : 켜짐");
//		} else {
//			System.out.println("전원상태 : 꺼짐");
//		}
	}
	



	// 볼륨을 올릴 수 있는 메소드
	// 메소드명 : increaseVolume()
	// 1) if 전원이 켜져있는지 확인
	//	켜져있는 경우 => 현재 볼륨 출력
	// 2) 		if 현재 볼륨이 99 이하면 1증가, 증가된 볼륨 출력
	// 3) 		else 현재 볼륨이 100이면 볼륨이 최대치입니다 출력
	// 4) else 꺼져있으면 전원을 먼저 켜주세요 출력
	void increaseVolume() {
		if(power) {
			System.out.println("현재 볼륨 : " + vol);
			if(vol <= 99) {
				vol++;
				System.out.println("올린 후 현재 볼륨 : " + vol);
			} else {
				System.out.println("더이상 볼륨을 올릴 수 없습니다.");
			}
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	
	// 볼륨을 내릴 수 있는 메소드
	// 메소드명 : decreaseVolume()
	// 1) if 전원이 켜져있는지 확인
	//		현재 볼륨 출력
	// 2)		if(vol이 1보다 작거나 같은때)
	//				볼륨1감소, 현재볼륨 출력
	// 3)		else
	//				볼륨이 최소입니다
	// 4) else 전원을 먼저 켜주세요
	void decreaseVolume() {
		if(power) {
			System.out.println("현재 볼륨 : " + vol);
			if(vol > 0) {
				vol--;
				System.out.println("내린 후 현재 볼륨 : " + vol);
			} else {
				System.out.println("더이상 볼륨을 내릴 수 없습니다.");
			}
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	// 채널을 올리는 메소드
	// 메소드명 : nextChannel()
	// power => true
	// ch++
	// if( ch > 100)
	//		ch = 0;
	// else
	//		전원을 켜주세요 출력
	void nextChannel() {
		if(power) {
			ch++;
			if(ch > 100) {
				ch = 0;
			}
			System.out.println("현재 채널 : " + ch);
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	// 채널 내리는 메소드
	// 메소드명 : previousChannel()
	void previousChannel() {
		if(power) {
			ch--;
			if(ch < 0) {
				ch = 100;
			}
			System.out.println("현재 채널 : " + ch);
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	
	
}
