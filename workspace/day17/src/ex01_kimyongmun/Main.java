package ex01_kimyongmun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 이름, 나이, 성적을 입력해주세요. : ");
		
		Student stu = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		
		stu.score();
		
	}
}
