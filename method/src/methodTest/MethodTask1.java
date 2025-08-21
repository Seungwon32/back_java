package methodTest;

public class MethodTask1 {
//	1~10까지 출력해주는 메서드 선언
	void printNumber (int num) {
		int[] num1= new int[num];
		for(int i =0; i<num; i++) {
			num1[i] += i+1;
			System.out.println(num1[i]);
		}	
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.printNumber(10);
	}
}
