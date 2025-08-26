package castingTask3;

public class Movie extends Netflix {
	public Movie() {;}
	
	@Override
	void function() {
		System.out.println("4D기능 사용");
	}
	
	void printName() {
		System.out.println("영화");
	}
}
