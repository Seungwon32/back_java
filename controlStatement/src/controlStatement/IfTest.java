package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String message="점심메뉴입력", menu=null;
		System.out.println(message);
		
		menu=sc.next();
		sc.close();
		
	      if(menu.equals("백반")) {
	          System.out.println("오늘의 점심");
	      }else if(menu == "돈까스") {   
	          System.out.println("오늘의 돈까스 점심");
	      }
	      else if(menu.equals("짜장면")) {
	          System.out.println("오늘의 짜장면 점심");
	      }
	      else if(menu.equals("우동")) {
	          System.out.println("오늘의 우동 점심");
	      }
	      else if(menu.equals("해장국")) {
	          System.out.println("오늘의 해장국 점심");
	      }
	      else if(menu.equals("샐러드")) {   
	          System.out.println("오늘의 샐러드 점심");
	      }else {
	          System.out.println("오늘의 없어 점심");
	      }
	}
}
