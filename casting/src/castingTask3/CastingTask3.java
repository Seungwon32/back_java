package castingTask3;
//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용
public class CastingTask3 {
	public static void main(String[] args) {
		User user = new User();
		
		// 각각의 장르 객체 생성
		Movie movie = new Movie("ddf");
		Drama drama = new Drama("wwww");
		Animation ani = new Animation(",,");
		
		user.printMessage(movie);
		user.printMessage(drama);
		user.printMessage(ani);
	}
}
