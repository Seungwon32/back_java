package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		//1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
		//대문자는 모두 소문자로 변경한다.
		//입력 예)안녕hI!!
		//출력 예)안녕Hi!!
//		1. 사용자에게 문자를 입력받음
//		2. 받은 문자열을 배열에 넣음.
//		3. 대문자는 소문자로 소문자는 대문자로 바꿈.
		Scanner sc = new Scanner(System.in);
		String message = "문자입력", input=null;
		char[] arData1 = null;
		
		System.out.println(message);
		input = sc.next();
		arData1 = new char[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			arData1[i] = input.charAt(i);
			if(input.charAt(i)>='a' && input.charAt(i)<='z') {
				//char 변수에 대입해서 자동으로 숫자를 char타입으로 바꿔줌
				arData1[i] -= 32;
			}
			else if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
				arData1[i] += 32;
			}
			System.out.print(arData1[i]);
		}
		System.out.println();
		

		
		//2. 정수를 한글로 변경
		//입력 예) 1024
		//출력 예) 일공이사	
//		1.사용자에게 숫자 입력받음
//		2.입력받은 숫자를 배열에 넣음.
//		3.입력받은 값 하나를 인덱스로 만들어서 한글숫자로 된 배열을 넣음
//		4.배열에 한글숫자 입력됨
		String messages = "숫자입력", nums=null;
		char[] arData2 = null;
		char[] arData4 = {'공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
		
		System.out.println(messages);
		nums=sc.next();
		sc.close();
		
		arData2 = new char[nums.length()];
		for(int i=0; i<nums.length(); i++) { 
			                       //char-char=int
			arData2[i] = arData4[nums.charAt(i)-'0'];  // 문자에서 '0'을 빼면 정수, nums.charAt(i)-48하고 같음
			System.out.print(arData2[i]);
		}
		
		
//		//예시//
//		 String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
//		            result2 = "", hangle = "공일이삼사오육칠팔구";
//		      System.out.println(message2);
//		      input2 = sc.nextLine();
//		      
//		      for(int i = 0; i < input2.length(); i++) {
//		         result2 += hangle.charAt(input2.charAt(i) - 48);
//		      }
//		      System.out.println(result2);
	}
}
