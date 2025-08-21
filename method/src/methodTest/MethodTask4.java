package methodTest;

public class MethodTask4 {
	//사용자에게 이름과 반복 횟수를 받아서 반복 횟수만큼 이름을 출력해주는 메서드
	void printNames(int num, String name) {
		for(int i=0; i<num; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		MethodTask4 mt = new MethodTask4();
		mt.printNames(5, "배승원");
	}
}
