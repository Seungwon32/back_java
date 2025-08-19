package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
//		10~1까지 출력
		for(int i=0; i<10; i++) {
			System.out.println(10-i);
		}

//		1번째 홍길동
//		2번째 홍길동
//		3번째 홍길동
//		...
//		5번째 홍길동
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"번째 홍길동");
		}
		
//		"abcd"를 이용해서 97 98 99 100을 출력
		int c = "abcd".charAt(0);
		for(int i=0; i<4; i++) {
			System.out.println(c+i);
		}
	
//		"abcd"에서 c빼고 출력 a b d
		char q = "abcd".charAt(0);
		for(int i=0; i<4; i++) {
			if(i != 2) {
				System.out.println((char)(q+i));
			}
		}
		
//		1~30까지 짝수를 출력
		for(int i=0; i<30; i++) {
			if((i+1)%2==0) {
				System.out.println(i+1);
			}
		}
		
//		1~30까지 짝수의 개수를 출력
		int num=0;
		for(int i=0; i<30; i++) {
			if((i+1)%2==0) {
				num++;
			}
		}
		System.out.println(num);
		
//		1~30까지 짝수의 총합 출력
		int sum=0;
		for(int i=0; i<30; i++) {
			if((i+1)%2==0) {
				sum += i+1;
			}
		}
		System.out.println(sum);
		
//		1~30까지 짝수를 7번째 숫자를 출력
		int num1=0;
		for(int i=0; i<30; i++) {
			if((i+1)%2==0) {
				num1++;
				if(num1==7) {
					System.out.println(i+1);
				}
			}
		}
		
//		1~30까지 첫번째 짝수와 마지막 짝수만 더해서 출력
		int number=30, num2=0, re1=0, re2=0, result=0;
		
		for(int i=0; i<number; i++) {
			if((i+1)%2==0) {
				num2++;
				if(num2==1) {
					re1=i+1;
				}
				if(num2==(number/2)) {
					re2=i+1;
				}
			}
		}
		result = re1+re2;
		System.out.println(result);
	}
}
