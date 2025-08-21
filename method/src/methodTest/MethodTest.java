package methodTest;

public class MethodTest {
	
//  1. 3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언
  //리턴타입:int
	int sub(int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	
//  2. 성과 이름을 붙여서 출력해주는 메서드 선언
 //리턴타입:void
	void printName(String lastName, String FirstName) {
		System.out.println(lastName+FirstName);
	}
	
	public static void main(String[] args) {
//		클래스 안(MethodTest)에 메서드
//		메서드
		MethodTest mt = new MethodTest();
		mt.printName("배","승원");
	}
}
