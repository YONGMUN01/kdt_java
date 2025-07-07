package staticTest;

public class EnumTest {
	// enum
	enum Day{	// 클래스처럼 사용할 수 있다
		MONDAY(true), TUESDAY(true), WEDESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);
		
		// 필드
		boolean week;

		// 생성자
		private Day(boolean week){
			this.week = week;
		}
	
		// 메소드
		boolean weekday() {
			return this.week;
		}
	
	}
	
	
	
	
	

	// 메인 메소드
	public static void main(String[] args) {
//		Day today = Day.THURSDAY;
		Day today = Day.FRIDAY;
		
		System.out.println("오늘은" + today + "입니다.");
		
		String result = null;
		
		// switch문을 사용하여 열거형 상수 처리
		switch(today) {
		case MONDAY:
//			System.out.println("월요일입니다.");
			result = "월요일";
			break;
		case THURSDAY:
//			System.out.println("목요일입니다.");
			result = "목요일";
			break;
		case WEDESDAY:
//			System.out.println("수요일입니다.");
			result = "수요일";
			break;
			default:
//				System.out.println("다른 요일입니다.");
				result = "다른 요일";
				break;
		}
		
		System.out.println("오늘은" + result + "입니다.");
		
		// 조건문 오늘이 
		if(today == Day.SUNDAY) {
			System.out.println("오늘은 평일입니다.");
		} else {
			System.out.println("오늘은 주말입니다.");
		}
		
		// 모든 열거형 값을 배열로 가져오는 메소드
		Day[] days = Day.values();
		System.out.println(days);	// [LstaticTest.EnumTest01$Day;@31befd9f
		
		for(Day day : days) {
			System.out.println(day);
		}
		
		
	}

	
}
