package objectTask;

import java.util.Objects;

// 상품 클래스를 만들고,
//toString, hashCode, Equals를 재정의하고
//같은 상품인지 비교하기
//1번 상품
//이름: 파인애플
//가격: 20000
//재고: 15
//원산지: 필리핀

public class ObjectTask1 {
	public static void main(String[] args) {
		Products obj1 = new Products(1,"파인애플", 20000, 15, "필리핀");
		Products obj2 = new Products(2,"수박", 20000, 15, "한국");
		
		System.out.println(obj1.equals(obj2));
	}
	
	
}
