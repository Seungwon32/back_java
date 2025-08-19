package operatorTest;

import java.util.Scanner;
//3개의 입력값 중 중간값 찾기
//17 25 35
//10 3 8
//sc.next();
//sc.nextint();
//입력예시: 10 3 8
//출력예시: 중간값: 8
public class OperTask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String message="3개의 숫자 입력";
		int num1=0, num2=0, num3=0, re1=0, re2=0, re3=0, re4=0;
		
		System.out.println(message);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		sc.close();
		
		re1=num1>num2?num1:num2;
		re4=num1>num2?num2:num1;
		re2=re1>num3?num3:re1;  //가장큰값제외시키기
		re3=re2>re4?re2:re4;    // 중간값 확정
		
		System.out.println(re3);
		
	}
}
