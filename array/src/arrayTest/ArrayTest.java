package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arData1 = {1,2,3,4};
		int[] arData2 = new int[5]; //new연산자 : 힙메모리에 배열(int[5])의 주소를 할당시키고 자동으로 주소값을 초기화시키는 것
		int[] arData3 = null; //주소의 초기값
		
		System.out.println(arData1[0]);  //주소값->해시코드
		
		for(int i=0; i<arData1.length; i++) {
			System.out.println(arData1[i]);
		}
	      
	}
}

