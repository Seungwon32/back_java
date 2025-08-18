package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
//		8.43 + 2.59를 더한 값이 10이 되도록 출력
		double num1 = 8.43;
		double num2 = 2.59;
		System.out.println((int)num1+(int)num2);
		
//		문자형 + 정수 = 정수
		System.out.println('A'+100);
		System.out.println((char)('A'+100));
	}
}
