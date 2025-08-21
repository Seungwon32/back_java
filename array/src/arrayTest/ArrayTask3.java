package arrayTest;

public class ArrayTask3 {
	public static void main(String[] args) {
//      1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기 
//짝수만 배열담기 -> 반복문으로 값 하나하나에 3더해주기
		int[] arData1 = {2,4,6,8,10,12,14,16,18,20};
		for(int i=0; i<arData1.length; i++) {
			arData1[i] += 3;
			System.out.println(arData1[i]);
		}
		System.out.println();
		
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//값 배열에 담기 -> 반복문을 통해 값을 더하기 -> 그 값을 배열의 길이로 나눠서 평균구하기
		int[] arData2 = {10,20,30,40,50};
		int sum=0, result=0;
		for(int i=0; i<arData2.length; i++) {
			sum += arData2[i];
		}
		result = sum / arData2.length;
		System.out.print(result);
		System.out.println();
		System.out.println();
		
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
//배열에 숫자 담기 -> 반복문안에 if문 사용해서 5보다 크면 2배해주기
		int[] arData3 = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arData3.length; i++) {
			if(arData3[i]>5) {
				arData3[i] = arData3[i] * 2;
			}
			System.out.println(arData3[i]);
		}
		System.out.println();
		
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
//배열에 숫자담기 -> 숫자+*를 합쳐서 넣을 배열 한개 더 만들기 -> 배열의 인덱스가 짝수와 0일때는 숫자, 홀수 인덱스번호일때는 *추가
//배열에 숫자 담기 -> 문자열변수 생성 -> 마지막인덱스제외 숫자 +* 출력
		int[] arData4 = {1,2,3,4,5,6,7,8,9,10};
//		String[] arData5 = new String[19];
		String result11 = "";
		
		for(int i=0; i<arData4.length; i++) {
			if(arData4[i] != 10) {
				result11 += arData4[i] + "*";
			}
			else {
				result11 += arData4[i];
			}
//			System.out.print(arData5[i]);
		}
		System.out.println(result11);
		
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기
//배열에 숫자 담기 -> for문안에 if문으로 3의 배수만 더하기
		int[] arData6 = {1,2,3,4,5,6,7,8,9,10};
		int result1=0;
		for(int i=0; i<arData6.length; i++) {
			if(arData6[i]%3==0) {
				result1 += arData6[i];
			}
		}
		System.out.println(result1);
	}
}
