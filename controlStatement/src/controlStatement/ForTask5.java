package controlStatement;

import java.util.Scanner;

public class ForTask5 {
	public static void main(String[] args) {
//      1. ACEG...Z 출력!
		String word = "";
		for(int i=0; i<26; i+=2) {
			word += (char)(i+65);
		}
		System.out.println(word);
		
//      2. 1 ~ N까지의 합 출력!
		Scanner sc = new Scanner(System.in);
		String message = "숫자입력";
		int number=0, result=0;
		
		System.out.println(message);
		number = sc.nextInt();
//		sc.close();
		
		for(int i=0; i<number; i++) {
			result +=(i+1);
		}
		System.out.println(result);
		
//      3. 0123401234 출력!
		String numbers="";
		for(int i=0; i<2; i++) {
			for(int j=0; j<5; j++) {
				numbers += j;
			}
		}
		System.out.println(numbers);
		
//      4. 입력예시) a1b22c357
//      abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
//      사용자가 입력한 횟수가 얼마가 있을지 모르고, 
//      입력한 횟수만큼 반복해주는 프로그램 만들기
//		Scanner scanner = new Scanner(System.in);
		String messages="입력예시) a1b22c357", input = null, results="";
 
		System.out.println(messages);
		input = sc.next();
		sc.close();
		
		char alpa=' ';
		String nums =""; 
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				alpa = input.charAt(i);
			}
			else {
				nums += input.charAt(i);

				if (i + 1 == input.length() || !('0' <= input.charAt(i + 1) && input.charAt(i + 1) <= '9')) {
					for(int j=0; j<Integer.parseInt(nums); j++) {
						results += alpa;
					}
					nums ="";	
			}
		}
	}
		System.out.println(results);
		
		
  }
}
