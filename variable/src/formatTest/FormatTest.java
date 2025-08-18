package formatTest;

public class FormatTest {
	public static void main(String[] args) {
//		배승원
//		20
//		200
		String name = "배승원";
		int age = 20;
		double tall = 200.5;
		System.out.printf("저의 이름은 %s입니다.\n", name);
		System.out.printf("저의 나이는 %d입니다.\n", age);
		System.out.printf("저의 키는 %.2fcm입니다.", tall);
	}
}
