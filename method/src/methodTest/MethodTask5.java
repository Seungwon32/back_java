package methodTest;

import java.util.Scanner;

public class MethodTask5 {
	// 1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
	int sumNumber(int num) {
		int result =0;
		for(int i=0; i<num; i++) {
			result += i+1;
		}
		return result;
	}
	
	// 2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
	String inputNum(String word) {
		for(int i=0; i<word.length(); i++) {
	        if(word.charAt(i) < '0' || word.charAt(i) > '9') {
	            return "문자열"; 
	        }
	    }
		if(Integer.parseInt(word) % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }

	}
	
	// 3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
	void printword(String data) {
		for(int i=0; i<data.length(); i++) {
			int numChar = 0;
			char ch = ' ';
			if(data.charAt(i) >= 'a' && data.charAt(i) <= 'z') {
				numChar = (int)(data.charAt(i) - 32);
				ch = (char)numChar;
			}
			else {
				ch = data.charAt(i);
			}
			System.out.print(ch);
		}
	}
	
	// 4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
	// 입력 예시) abcdef
	// 출력 예시) fedcba
	void reverseWord(String data1) {
		char ch1=' ';
		int count = data1.length();
		for(int i=0; i<count; i++) {
			ch1 = data1.charAt(count-i-1);
			System.out.print(ch1);
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask5 mt = new MethodTask5();
		
//		1번
		int num1=0, result1=0;
		System.out.println("숫자입력");
		num1 = sc.nextInt();
		result1 = mt.sumNumber(num1);
		System.out.println(result1);
		
//		2번
		String words=null, result2="";
		System.out.println("입력");
		words =sc.next();
		result2=mt.inputNum(words);
		System.out.println(result2);
		
//		3번
		String data1=null;
		System.out.println("문자입력");
		data1=sc.next();
		mt.printword(data1);
		System.out.println();
		
//		4번
		String data2=null;
		System.out.println("문자입력");
		data2=sc.next();	
		sc.close();
		mt.reverseWord(data2);
		
	}
}
