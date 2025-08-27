package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		//메서드 구현 후 4개의 메서드 모두 사용
		MathTask mathtask = new MathTask() {
			
			@Override
			public void printName(String name) {
				System.out.println("이름: " + name);
			}
			
			@Override
			public String concat(String str1, String str2) {
				return str1 + str2;
			}
			
			@Override
			public CalcResult calc(int num1, int num2) {
				int sum = num1 + num2;
		        int sub = num1 - num2;
		        int mul = num1 * num2;
		        int div = num1 / num2;
		        return new CalcResult(sum, sub, mul, div);

			}
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			
		};
		
	
        mathtask.printName("배승원");

        String resultStr = mathtask.concat("Hello, ", "World!");
        System.out.println("concat 결과: " + resultStr);

        CalcResult calcResult = mathtask.calc(10, 5);
        System.out.println("더하기:" + 
        		calcResult.getSum()+ " 나누기:" +calcResult.getDiv()+ " 곱하기:" +calcResult.getMul()+ " 빼기:" +calcResult.getSub());

        int addResult = mathtask.add(7, 3);
        System.out.println("add 결과: " + addResult);
		
		
		
		
	}
}
