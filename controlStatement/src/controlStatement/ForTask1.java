package controlStatement;

import java.util.Scanner;
//아래와 같은 문자열이 있을 때
//문자열은 연결시키고, 숫자는 연산하여 결과를 알려준다
//사용자가 임의로 정수와 알파벳을 입력할 때
//"abZ182bePz92"
//출력 예시) 문자열: abZbePz, 정수: 22
//.charAt(인덱스)
public class ForTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "문자 입력", word = null, word2="", word3="";
		int result=0;
		System.out.println(message);
		
		word = sc.next();
		sc.close();

		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)>='0'&& word.charAt(i)<='9') {
				word2 += word.charAt(i);
			}
			else {
				word3 += word.charAt(i);
			}
		}

		for(int i=0; i<word2.length(); i++) {
			result += Integer.parseInt(String.valueOf(word2.charAt(i)));
		}
		
		System.out.printf("문자열:%s, 정수:%s\n", word3,word2);
		System.out.println(result);
	}
}
//
////아래와 같은 문자열이 있을 때
////문자열은 연결시키고, 숫자는 연산하여 결과를 알려준다
////사용자가 임의로 정수와 알파벳을 입력할 때
////"abZ182bePz92"
////출력 예시) 문자열: abZbePz, 정수: 22
////.charAt(인덱스)
//Scanner sc = new Scanner(System.in);
//String input = null, str = "", result = "입력값: %s\n문자열: %s, 정수: %d",
//    message = "정수와 문자열을 혼합한 글자를 입력하세요.\nex)abZ182bePz92";
//int total = 0;
//System.out.println(message);
//input = sc.next();
//
//for(int i = 0; i < input.length(); i++) {
//// 아스키코드
// int c = (int)input.charAt(i);
// if(c >= 48 && c <= 57) {
//    total += c - 48;
// }else {
//    str += (char)c;
// }
//}
//
//System.out.printf(result, input, str, total);
