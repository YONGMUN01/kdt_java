package gameTask;

public class Wizard extends Character{
//	1) Wizard 클래스
//Character 클래스 상송
//기본 생성자를 통해 마법사, 15, 30, 1, 30, 0 전달
//normalAttack() 오버라이딩 : 체력 2 감소 후 공격 실행
//skillAttack()	오버라이딩 : mp가 부족하면 출력 후 실패
//specialAttack()	오버라이딩 : 마법사는 특수공격이 없습니다 출력
	
	public Wizard() {
		super("마법사", 15, 30, 1, 30, 0);
	}

	@Override
	public void normalAttack() {
		// TODO Auto-generated method stub
//		super.normalAttack();
		this.hp -= 2;
		super.normalAttack();
		revive();
	}

	@Override
	public void skillAttack() {
		// TODO Auto-generated method stub
		if(checkMp(10)) {
			showStatus();
		} else {
			System.out.println("마나 부족으로 스킬사용 불가.");
			showStatus();
		}
	}

	@Override
	public void specialAttack() {
		System.out.println("마법사는 특수공격이 없습니다.");
		showStatus();
	}
	
	
	
	
	
	
	
	

}
