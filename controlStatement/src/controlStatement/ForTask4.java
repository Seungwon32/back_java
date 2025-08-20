package controlStatement;

import java.util.Scanner;
//해당 문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램
//입력 예시) a1b3d2c4
//출력 예시) abbbddcccc
//단 횟수는 "1-9".
public class ForTask4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "해당문자와 반복할 횟수를 입력", data=null, result="";
		
		System.out.println(message);
		data = sc.next();
		sc.close();
		
		for(int i=0; i<data.length(); i++) {
			if(data.charAt(i)>='1' && data.charAt(i)<='9') {
//				System.out.println((int)(data.charAt(i)));
				for(int j=0; j<(int)(data.charAt(i))-48; j++) {
					result += data.charAt(i-1);
				}
			}
			
		}
		System.out.println(result);
	}
}


////홀수짝수 알고리즘
//Scanner sc = new Scanner(System.in);
//String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2",
//    input = null, result = "";
//
//System.out.println(message);
//input = sc.next();
//
////for(int i = 0; i < input.length(); i++) {
//// if(i % 2 == 0) {
////    char c = input.charAt(i);
////    int count = input.charAt(i + 1) - 48;
////    
////    for(int j = 0; j < count; j++) {
////       result += c;
////    }
//// }
////}
////System.out.println(result);
//
//for(int i = 0; i < input.length(); i += 2) {
// char c = input.charAt(i);
// int count = input.charAt(i + 1) - 48;
// 
// for(int j = 0; j < count; j++) {
//    result += c;
// }
//}
//System.out.println(result);
