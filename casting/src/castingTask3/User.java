package castingTask3;

public class User {
	String genre;
	String title;
	
	public User() {;}

	public User(String genre, String title) {
		this.genre = genre;
		this.title = title;
	}
	
	void printMessage(Netflix netflix) {
		if(netflix instanceof Movie) {
			Movie movie = (Movie)netflix;
			movie.printName();
		}else if(netflix instanceof Drama) {
			Drama drama = (Drama)netflix;
			drama.printTime();
		}else if(netflix instanceof Animation) {
			Animation ani = (Animation)netflix;
			ani.language();
		}
	}
	
}
