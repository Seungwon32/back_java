package inputTest;

import java.util.Scanner;

//3개의 정수를 한 번에 입력 받은 후
//세 정수의 곱셈을 출력
//sc.next()만 사용
public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "숫자 3개 입력", num1=null,num2=null,num3=null, resultMessage="";
		int re1=0, re2=0,re3=0, result=0;
		resultMessage ="첫번째 숫자:%s,두번째 숫자:%s,세번째 숫자:%s\n%d";
		System.out.println(message);
		
		num1=sc.next();
		num2=sc.next();
		num3=sc.next();
		sc.close();
		
		re1=Integer.parseInt(num1);
		re2=Integer.parseInt(num2);
		re3=Integer.parseInt(num3);
		
		result = re1*re2*re3;
		
//		System.out.println(result);
		System.out.printf(resultMessage,num1,num2,num3,result);
	}
}
