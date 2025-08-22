package classTask;
//	마켓 객체생성, 소비자 객체 생성
// 구매할 수량 , 물건 지정
// 수량확인해서 구매가능 확인
// 할인율 적용해서 가격 계산
// 구매하기
class Market {
//	상품명, 상품가격, 상품재고
//	판매(sell)
//	힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
	String product;
	int price;
	int quantity;
	
	public Market() {;}
	public Market(String product, int price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	void sell(Customer customer) {
		double price1=0.0;
		
		price1 = this.price * (100-customer.sale)/100;
	}
}

class Customer{
//	이름, 폰번호, 돈, 할인율
	String name;
	String phoneNumber;
	int money;
	int sale;
	
	public Customer() {;}
	public Customer(String name, String phoneNumber, int money, int sale) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.sale = sale;
	}
	public Customer(String name, String phoneNumber, int money, int sale) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.sale = sale;
		
	}
	
}

public class ClassTask2 {
	public static void main(String[] args) {
//		마켓, 소비자를 객체화 시키고, 소비자에게 마켓의 물건을 판매, 
//		마켓의 상품재고와 소비자의 남은 금액을 출력
		Market mg1 = new Market("수박",30000, 4);
		Customer cs1 = new Customer("배승원", "010-0000-0000", 50000, 50);
		String[] data1 = {"배승원", "010-0000-0000", "50000", "50"};
	}
}
