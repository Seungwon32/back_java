package collectionTest.ArrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userfield = new UserField();
		
		//회원가입
		User user = new User("bsw1234", "배승원", "1234","01000000000");
		userfield.join(user);
		System.out.println(DBconnecter.users);
		
		//로그인
		User userForLogin = new User("bsw1234", "배승원", "1234","01000000000");
		if(userfield.login(userForLogin)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//비밀번호 변경
		userForLogin.setPassword("12345");
		userfield.update(userForLogin);
		
		//로그아웃
		userfield.logout();
		System.out.println(UserField.userId);
	}
}
