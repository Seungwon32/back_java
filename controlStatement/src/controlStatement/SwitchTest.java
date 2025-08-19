package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "MBTI를 입력", mbti=null;
		
		System.out.println(message);
		mbti = sc.next();
		sc.close();
		
		switch(mbti) {
		case "ENFP":
			System.out.println("게으름노답");
			break;
		case "ISTP":
			System.out.println("반항가");
			break;
		case "ESFP":
			System.out.println("고집");
			break;
		case "ESTJ":
			System.out.println("설명충");
			break;
		}
		
		


	}
}
