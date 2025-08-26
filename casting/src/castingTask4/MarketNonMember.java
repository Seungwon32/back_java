package castingTask4;
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰 
public class MarketNonMember extends Customer{
	public MarketNonMember() {;}
	public MarketNonMember(String name, int money) {
        super(name, money);
    }

    // 비회원은 5% 할인
    double discountRate() {
        return 0.05;
    }
	
}
