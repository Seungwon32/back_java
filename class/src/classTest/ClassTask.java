package classTest;

//동물(ClassTask)
//이름(name), 나이(age), 먹이(feed)
//추상화
//기본 생성자, 초기화 생성자
//토끼, 강아지, 고양이 객체(객체화)
public class ClassTask {
	String name, feed;
	int age;
	
//	생성자의 오버로딩
	public ClassTask() {;}
// alt + shift + s
	public ClassTask(String name, int age, String feed) {
		this.name = name;
		this.feed = feed;
		this.age = age;
}

	public static void main(String[] args) {
		ClassTask rabbit = new ClassTask("토꺵이", 2, "잡식");
		ClassTask dog = new ClassTask("멍멍이", 5, "잡식");
		ClassTask cat = new ClassTask("야옹이", 4, "잡식");
		
		System.out.println(rabbit.name);
		System.out.println(dog.name);
		System.out.println(cat.name);
	}
}
