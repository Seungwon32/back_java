package castingTask4;
//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketMember extends Customer{
	public MarketMember() {;}

	public MarketMember(String name, int money) {
	        super(name, money);
	    }
	
	    // 회원은 30% 할인
	    double discountRate() {
	        return 0.30;
	    }
	
}
