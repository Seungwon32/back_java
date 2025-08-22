package classTest;

//추상화
public class ClassTest {
	
//	필드, 멤버, 멤버변수
	String name;
	int age;
	
//	생성자의 선언
	//기본 생성자
	public ClassTest() {;}
	//초기화 생성자
	public ClassTest(String name, int age) {
		//this는 각각 다른 클래서의 주소를 가지고 있음.
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//객체화	//타입     //객체  //생성자의 사용-클래스를 힙메모리에 할당시킨 주소값을 가져옴(주소값을 리턴한다), 우리가 return을 이용해서 리턴할 수 없음	
		ClassTest ct1 = new ClassTest("홍길동", 20);
		ClassTest ct2 = new ClassTest("배승원", 23);
		ClassTest ct3 = new ClassTest();
		
		System.out.println(ct1.name);
		System.out.println(ct2.name);
  }
}
