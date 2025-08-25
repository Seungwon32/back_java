package classTask;
//마켓 객체생성, 소비자 객체 생성
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
	
	void sell(Customer customer, int amount) {
		double price1=0.0;
		double pay=0.0;
		//재고확인
		if(this.quantity < amount) {
			System.out.printf("[실패] 재고 부족: 요청 %d개, 보유 %d개%n", amount, this.quantity);
		}
		
		//할인적용가격
		price1 = this.price * (100-customer.sale)/100;
		pay = price1*amount;
		
		// 4) 고객 잔액 확인
        if (customer.money < pay) {
            System.out.printf("[실패] 잔액 부족: 결제금액 %,d원, 보유 %,d원%n", pay, customer.money);
        }
        
        //구매처리,재고, 돈 차감
        this.quantity -= amount;
        customer.money -= pay;
        
        //결과
        System.out.printf("[성공] %s님이 %s %d개 구매!",customer.name, this.product, amount);
    
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
	
	
}

public class ClassTask2 {
	public static void main(String[] args) {
//		마켓, 소비자를 객체화 시키고, 소비자에게 마켓의 물건을 판매, 
//		마켓의 상품재고와 소비자의 남은 금액을 출력
		Market mg1 = new Market("수박",30000, 4);
		Customer cs1 = new Customer("배승원", "010-0000-0000", 50000, 50);
//		String[] data1 = {"배승원", "010-0000-0000", "50000", "50"};
		
	}
}









//package classTask;
//
//class Market {
////   1. 상품명, 상품가격, 상품재고
//   String productName;
//   int productPrice;
//   int productStock;
//   
//   public Market() {;}
//   public Market(String productName, int productPrice, int productStock) {
//      this.productName = productName;
//      this.productPrice = productPrice;
//      this.productStock = productStock;
//   }
//   
////   판매(sell)
////   힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
//   void sell(Customer customer) {
//      customer.money -= productPrice - productPrice * (customer.discount / 100.0);
//      productStock--;
//   }
//}
//
//class Customer {
////   2. 이름, 폰, 돈, 할인율
//   String name;
//   String phone;
//   int money;
//   int discount;
//   
//   public Customer() {;}
//   public Customer(String name, String phone, int money, int discount) {
//      this.name = name;
//      this.phone = phone;
//      this.money = money;
//      this.discount = discount;
//   }
//   
//}
//
//public class ClassTask2 {
//   public static void main(String[] args) {
////      3. 마켓, 소비자를 객체화 시키고,
////      소비자에게 마켓의 물건을 판매
////      마켓의 상품 재고와, 소비자의 남은 금액을 출력
//      Market emart = new Market("사과", 20000, 20);
//      Customer ksh = new Customer("김세환", "01000000000", 40000, 30);
//      emart.sell(ksh);
//      
//      System.out.println(emart.productStock);
//      System.out.println(ksh.money);
//   }
//}
//


