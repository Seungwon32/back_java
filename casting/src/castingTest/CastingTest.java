package castingTest;

class A {
	   void test() {
	      System.out.println("A");
   }
}

class B extends A{
   void test() {
      System.out.println("B");
   }
   
   void test2() {
      System.out.println("BB");
   }
}
	
public class CastingTest {
	public static void main(String[] args) {
		A b = new B(); //업캐스팅
	      B bb = (B)b;  //업캐스팅된걸로 다운함 다운캐스팅
//	      B a = new A(); 다운캐스팅아님
	      b.test();
	}
}
