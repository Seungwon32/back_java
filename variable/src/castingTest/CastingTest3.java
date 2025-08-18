package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		//기본자료형
		int a = 0;
		char b = ' ';
		//클래스자료형
		String c = "";
		
		//문자열의 강제 형변환
//		System.out.println((int)"10");  이거 안됨
		System.out.println(Integer.parseInt("10")-5);
		System.out.println(Float.parseFloat("10"));
		System.out.println(Double.parseDouble("10"));
		System.out.println(Boolean.parseBoolean("10"));
	}
}
