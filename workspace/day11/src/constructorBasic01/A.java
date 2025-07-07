package constructorBasic01;
// 3-2번 : 생성자 this
public class A {

	  //필드
	   int num;
	   int num2;
	   
	   //메소드
	   void method(int num) {
	      int num2 = num; 
	      System.out.println(this);
	      System.out.println("매개변수 num : "+ num);
	      System.out.println("필드의 num : "+ this.num2);
	   }
	
}
