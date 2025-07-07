package interfaceTest06;
//23번 : 어댑터클래스
//CeilingFan 클래스
// 3개 메소드 전장선풍기를 켭니다, 천장선풍기를 끕니다, 비워두기
public class CeilingFan extends FanAdapter{

	@Override
	public void on() {
		System.out.println("천장 선풍기를 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("천장 선풍기를 끕니다.");
	}

}
