package ex05_김용문;

public enum Major {

	COMPUTER_SCIENCE("컴퓨터공학"), CYBER_SECURITY("정보보안학"), ARTIFICIAL_INTELLIGENCE("인공지능학");

	final private String koreanName;

	private Major(String koreanName) {
		this.koreanName = koreanName;
	}

	String getKoreanName() {
		return koreanName;
	}
}
