package toStringTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}
	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	//alt + shift +s+s
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports);
		sports.setType("축구");
		sports.setTotal(11);
	}
	
}
