package methodTest;

public class MethodTask3 {
//	1부터 n번까지 출력해주는 함수
	void printNumbers (int num) {
		int[] num1= new int[num];
		for(int i =0; i<num; i++) {
			num1[i] += i+1;
			System.out.println(num1[i]);
		}	
	}
	
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
		mt.printNumbers(16);
	}
}
