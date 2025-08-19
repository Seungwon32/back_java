package operatorTest;

import java.util.Scanner;

//사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오.
//단 next() 사용
//입력 결과) 1.1
//출력 결과) 실수

public class OperTask1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String message="숫자를 입력", num=null, result=null;
		double re1=0.0;
		
		System.out.println(message);
		num=sc.next();
		sc.close();
		
		re1=Double.parseDouble(num);
		
		result=re1%1==0?"정수":"실수";
		
		System.out.println(result);
		
	}
}
