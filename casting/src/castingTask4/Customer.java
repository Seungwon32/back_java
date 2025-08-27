package castingTask4;

public class Customer {
	//grid모드 alt + shift + a
	//필드선언시 자동으로 초기화 해줌
	private String name;
    private String phone;
    private int money;     
    private int point;     
    private int coupon;
    private int discount;
    
    public Customer() {;}
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
	{
		this.point = 0;
		this.coupon = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
    
}
