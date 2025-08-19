package controlStatement;

import java.util.Scanner;

//계절을 맞추는 프로그램
//겨울 12 1 2 
//봄 3 4 5
//여름 6 7 8
//가을 9 10 11

//입력) 10
//출력) 10월은 가을입니다.

public class SwitchTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message="월을 입력하세요";
		int month = 0;
		
		System.out.println(message);
		
		month = sc.nextInt();
		sc.close();
		
		switch (month) {
        case 12: case 1: case 2:
            System.out.printf("%d월은 겨울입니다.%n", month);
            break;
        case 3: case 4: case 5:
            System.out.printf("%d월은 봄입니다.%n", month);
            break;
        case 6: case 7: case 8:
            System.out.printf("%d월은 여름입니다.%n", month);
            break;
        case 9: case 10: case 11:
            System.out.printf("%d월은 가을입니다.%n", month);
            break;
        default:
            System.out.println("1~12 사이의 값을 입력하세요.");
	}
		
		
//		Scanner sc = new Scanner(System.in);
//	      String message = "계절을 확인하고 싶은 월을 입력하세요.\nex)10",
//	            seasonMessage = "";
//	      int month = 0, season = 0;
//	      
//	      System.out.println(message);
//	      month = sc.nextInt();
//	      season = month / 3 % 4;
//	      
//	      switch(season) {
//	      case 0:
//	         seasonMessage = month + "월은 겨울입니다.";
//	         break;
//	      case 1:
//	         seasonMessage = month + "월은 봄입니다.";
//	         break;
//	      case 2:
//	         seasonMessage = month + "월은 여름입니다.";
//	         break;
//	      case 3:
//	         seasonMessage = month + "월은 가을입니다.";
//	         break;
//	      default:
//	         break;
//	      }
//	   
//	      System.out.println(seasonMessage);
  }
}
