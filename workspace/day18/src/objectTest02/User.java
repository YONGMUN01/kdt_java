package objectTest02;

public class User {
	// 필드
		String name;
		int age;

		// 생성자
		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		// 메소드
		// toString() : alt + shift + s + s
		@Override
		public String toString() {
			return "UserMain [name=" + name + ", age=" + age + "]";
		}

		
		@Override
		public boolean equals(Object obj) {
//			// 자기자신과 같은 경우
//			if(this == obj) {
//				return true;
//			}
//			
//			// 이름이 같은 경우 => 같은 객체로 판단
//			if(obj instanceof User) {
//				String other = ((User)obj).name;
//				if(this.name.length() == other.length()) {
//					for(int i = 0; i < this.name.length(); i++) {
//						if(this.name.charAt(i) != other.charAt(i)) {
//							return false;
//						}
//					}
//					return true;
//				}
//			}
			
			if(obj instanceof User) {
				String other = ((User)obj).name;
				return this.name.equals(other);
			}
			return false;
		}


		// equals를 재정의하면 hashCode로 재정의해야한다
		// 동일 객체에 대해 같은 HashCode값이 반환되도록 한다
		// 이름을 해시코드값으로 쓸 때는 name.hashCode()
		// 나이를 해시코드값으로 쓸 때는 Integer.hashCode()
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return name.hashCode();
			
		}
		
		
		
		
}
