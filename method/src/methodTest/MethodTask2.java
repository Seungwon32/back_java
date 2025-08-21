package methodTest;
	
public class MethodTask2 {
//	이름을 10번 출력해주는 메서드
	void printName(String name) {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.printName("배승원");
	}
}
