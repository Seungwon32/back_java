package classTask;
// 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 매서드
//클래스로 리턴
//메인 메서드에서 메서드 사용

class Result{
	int max;
	int min;
	
	public Result() {;}

	public Result(int max, int min) {
		this.max = max;
		this.min = min;
	}
}

class MaxMin{
	int num1;
	int num2;
	
	public MaxMin() {;}
	public MaxMin(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	MaxMin getMaxMin(Result result) {
		if(num1>num2) {
			result.max=num1;
			result.min=num2;
		}
		else {
			result.max=num2;
			result.min=num1;
		}
		return this;
	}
	
}

public class ClassTask3 {
	public static void main(String[] args) {
		MaxMin mm = new MaxMin(10, 5);
		Result r = new Result();
		mm.getMaxMin(r);
		
		System.out.println("최댓값: " + r.max);
		System.out.println("최솟값: " + r.min);
	}
}














//package classTask;
//
////1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
////2. 클래스로 리턴
////3. 메인 메서드에서 메서드 사용
//public class ClassTask3 {
//Result getMaxAndMin(int[] arData) {
//   Result result = new Result(arData[0], arData[0]);
//   for(int i = 0; i < arData.length; i++) {
//      if(result.min > arData[i]) { result.min = arData[i]; };
//      if(result.max < arData[i]) { result.max = arData[i]; };
//   }
//   return result;
//}
//
//public static void main(String[] args) {
//   ClassTask3 ct3 = new ClassTask3();
//   int[] arData = {1, 3, 5, 9, 0};
//   Result result = ct3.getMaxAndMin(arData);
//   System.out.println(result.min);
//   System.out.println(result.max);
//}
//
//}
//
//package classTask;
//
//public class Result {
//   int min;
//   int max;
//   
//   public Result() {;}
//   public Result(int min, int max) {
//      this.min = min;
//      this.max = max;
//   }
//   
//}