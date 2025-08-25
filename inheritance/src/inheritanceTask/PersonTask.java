package inheritanceTask;
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다

public class PersonTask {
	String name;
	String address;
	String phoneNumber;
	int age;
	
	public PersonTask() {;}
	public PersonTask(String name, String address, String phoneNumber, int age) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	void work() {
		System.out.println("일을한다");
	}
	void sleep() {
		System.out.println("잠을잔다");
	}
	void eat() {
		System.out.println("세끼를 먹는다");
	}
}
