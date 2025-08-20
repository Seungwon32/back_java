package controlStatement;

public class ForTask3 {
	public static void main(String[] args) {
		
//		1부터 100까지 7의 배수 구하기
		String result="";
		for(int i=0; i<100; i++) {
			if((i+1)%7==0) {
				result += (i+1)+" ";
			}
		}
		System.out.println(result);
		
//      a ~ z까지 반복해서 아래의 결과를 출력한다
//      "aBcDeFg ... Z"
		String word = "";
		for(int i=0; i<26; i++) {
			if((i+1)%2!=0) {
				word += (char)(i+97);
			}
			else {
				word += (char)(i+65);
			}
		}
		System.out.println(word);
		
//		
	}
}
