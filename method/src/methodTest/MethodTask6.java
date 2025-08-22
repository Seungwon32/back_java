package methodTest;

import java.util.Scanner;

public class MethodTask6 {
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 매서드
//	문자열과 문자를 입력받는다. 
//	반복문으로 문자열과 찾고 싶은 문자열의 갯수를 구한다.
//
	void countNum (String message, String word) {
		int count=0;
		for(int i=0; i<message.length(); i++) {
			if(message.charAt(i) == word.charAt(0)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
//	 int getCount(String value, char c) {
//	      return value.length() - value.replaceAll(String.valueOf(c), "").length();
//	   }
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask6 mt = new MethodTask6();
		
		String messages=null, words=null;
		System.out.println("문자열과 찾고싶은 문자입력");
		messages = sc.next();
		words = sc.next();
		mt.countNum(messages, words);
	}
}
