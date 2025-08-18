package inputTest;

import java.util.Scanner;

//사용자에게 정수를 2개 입력 받고,
//두 수를 더해서 출력하기
//30 
//50
//출력: 80
//단, 메서드는 .next()만 사용
public class InputTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두 정수를 입력", num1="", num2="";
		int result = 0, re1 = 0, re2=0;
		
		System.out.println(message);
		num1=sc.next();
		num2=sc.next();
		re1=Integer.parseInt(num1);
		re2=Integer.parseInt(num2);
		result = re1+re2;
		System.out.println(result);
	}
}
