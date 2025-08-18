package castingTest;

public class CastingTask4 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		String num1 = "12.123", num2 = "345.789", num3 = "6789";
		
//		int result1 = (int)(Double.parseDouble(num1));
//		int result2 = (int)(Double.parseDouble(num2));
//		int result3 = (int)(Double.parseDouble(num3));
//		System.out.println(""+result1+result2+result3);  결과 문자열
		
		String result1 = String.valueOf((int)(Double.parseDouble(num1)));
		String result2 = String.valueOf((int)(Double.parseDouble(num2)));
		String result3 = String.valueOf((int)(Double.parseDouble(num3)));
		
		String result4 = result1+result2+result3;
		System.out.println((int)(Double.parseDouble(result4)));
	
	


	}
}
