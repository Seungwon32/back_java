package castingTask4;

public class Customer {
	private String name;
    private String phone;
    private int money;     
    private int point;     
    private int coupon;
    
    public Customer() {;}
	public Customer(String name, String phone, int money, int point, int coupon) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
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
    
	double discountRate() {
        return 0.0;
    }

    public String toString() {
        return "[" + name + "] 돈: " + money + "원";
    }
}
