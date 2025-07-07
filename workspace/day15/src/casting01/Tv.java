package casting01;
// 4번 : casting 부모 클래스
public class Tv {

	boolean power;
	int ch;
	int vol;
	
	void powerOnOff() {
		System.out.println("tv 전원을 켜거나 끕니다.");
	}
	
	void chUp() {
		System.out.println("채널을 올립니다.");
	}
	
	void chDown() {
		System.out.println("채널을 내립니다.");
	}
	
}
