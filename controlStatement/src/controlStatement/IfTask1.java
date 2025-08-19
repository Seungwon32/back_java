package controlStatement;

import java.util.Scanner;

//두 수의 크기 비교
//입력예시) 10 20
//출력예시) 큰 값: 20, 작은 값: 10
//if문으로

public class IfTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "두개의 숫자 입력", result = "";
		int num1 = 0, num2 = 0;
		
		result = "큰값: %d, 작은 값:%d";
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		
		if(num1 > num2) {
			System.out.printf(result, num1, num2);
		}
		else if(num1==num2) {
			System.out.println("같음");
		}
		else {
			System.out.printf(result, num2, num1);
		}
	}
}
