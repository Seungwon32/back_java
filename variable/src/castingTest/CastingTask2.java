package castingTest;

public class CastingTask2 {
   public static void main(String[] args) {
//      1 + "8.24" + "7.8" 두 값을 더해서 115로 만들어 출력하기
      int num1 = 1;
      String str1 = "8.24", str2 = "7.8";
//      "8.24" -> 8.24 -> 8
//      "7.8" -> 7.8 -> 7
//      정수 + 정수 + 정수
//      연결 + 연결 + 연결
      System.out.println("" + 1 + (7 + 8)); 
      System.out.println("" + num1 + ((int)Double.parseDouble(str1) + (int)Double.parseDouble(str2)));
      
//      String n = String.valueOf(false)
   }
}
