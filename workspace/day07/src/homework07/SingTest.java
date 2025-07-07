package homework07;

import java.util.Scanner;

public class SingTest {
   public static void main(String[] args) {

      // 7. 코인 노래방 시스템을 구현하는 개발자입니다.
      // 사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
      // 로직 구성
      // 1) 입력클래스 선언, import
      // 2) 정수형 변수 선언 후 초기화, 입력 - (곡 당 가격, 금액, 음료 여부), (음료가격, 곡 수, 서비스, 잔돈)
      // 3) syso(곡 당 가격 : );
      // 4) 곡 당 가격에 입력값 대입
      // 5) while(true)
      //       5-1) syso(금액 입력 0입력 종료)
      //       5-2) 금액 입력값 대입
      //      5-2) if(금액 == 0)
      //            syso("프로그램을 종료합니다.");
      //            break;
      //       5-3) if(금액 < 곡 당 가격)
      //             syso("노래를 부를 수 없습니다");
      //            continue;
      //       5-4) 곡 수 = 금액 / 곡당 가격; 
      //          잔돈 = 금액 % 곡당 가격;
      //           서비스 = 금액 / (곡당 가격 * 5);
      //       5-5) if(서비스 > 0)
      //             syso(서비스가 추가되어 곡수 + 서비스곡을 부를 수 있습니다");
      //       5-6) else
      //             syso(몇곡 가능 잔돈)
      //       5-7) 곡 수 = (금액 -100) / 곡당 가격;
      //           잔돈 = (금액 - 100) % 곡당 가격;
      //           서비스 = (금액 - 100) / (곡당 가격 * 5);
      //       5-8) if(서비스 > 0)
      //             syso("음료를 드시면 서비스가 추가되어 곡 + 서비스곡을 부를 수 있으며 잔돈은 00원입니다.");
      //           else
      //            syso("음료를 드시면 곡을 부를 수 있으며 잔돈은 00원입니다.");
      //       5-9) while(true)
      //             syso(음료구매여부)
      //             음료여부변수 입력값 대입
      //             if문(음료여부변수.equals("YES"))
      //                syso("음료를 구매하셨습니다");
      //                break;
      //             else if문(음료여부변수.equals("NO"))
      //                syso("음료를 구매하지 않으셨습니다.");
      //                break;
      //             else
      //                syso("다시 입력해주세요");
      //                continue;
      // 6) Scanner 종료

      Scanner sc = new Scanner(System.in);
      int money = 0, price = 0;
      String drink_yn;
      int drink = 100, song = 0, service = 0, change = 0;
      System.out.print("곡 당 가격 : ");
      price = sc.nextInt();
      sc.nextLine();

      while (true) {
         System.out.print("금액 입력(0입력시 종료) : ");
         money = sc.nextInt();
         sc.nextLine();

         if (money == 0) {
            System.out.println("프로그램을 종료합니다");
            break;
         }

         if (money < price) {
            System.out.println("노래를 부를 수 없습니다.");
            continue;
         }

         song = money / price;
         change = money % price;
         service = money / (price * 5);

         if (service > 0) {
            System.out.println("서비스가 추가되어 " + (song + service) + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다.");
         } else {
            System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d원입니다.\n", song, change);
         }

         song = (money - drink) / price;
         change = (money - drink) % price;
         service = (money - drink) / (price * 5);

         if (service > 0) {
            System.out.printf("음료를 드시면 서비스가 추가되어 %d곡을 부를 수 있으며 잔돈은 %d원 입니다\n", (song + service), change);
         } else {
            System.out.printf("음료를 드시면 %d곡을 부를 수 있으며 잔돈은 %d원 입니다.\n", song, change);
         }

         while (true) {
            System.out.print("음료를 구매하시겠습니까?");
            drink_yn = sc.nextLine();
            if (drink_yn.equals("YES")) {
               System.out.println("음료를 구매하셨습니다.");
               break;
            } else if (drink_yn.equals("NO")) {
               System.out.println("음료를 구매하지 않으셨습니다");
               break;
            } else {
               System.out.println("다시 입력해주세요.");
               continue;
            }
         }
      }

      sc.close();
   }
}
