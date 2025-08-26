package access;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	public Access1(int data1, int data2, int data3, int data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
//	getter 값을 가져옴
	public int getData4() {
		return data4;
	}
	
//	setter  값을 수정
	public void setData4(int daya4) {
		this.data4=data4;
	}
}
