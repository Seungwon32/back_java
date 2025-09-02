package collectionTest.ArrayList2;

import java.util.ArrayList;

public class UserField {
//	users를 db라고 생각하기
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	final int KEY = 300;
	
	//아이디검사
	public User checkId(String id) {
//		id를 받아서 db에 아이디가 있는지 아닌지를 검사.
		for(User user: users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;  //잘못 입력하면  null 반환
	}
	
	//회원가입
	public void join(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			users.add(user);
		}
	}
	
	//로그인  아이디 / 비밀번호 / 통과
//	public boolean login(User user) {
//		for (User u : users) {
//	        if (u.getId().equals(user.getId()) && u.getPassword().equals(user.getPassword())) {
//	            return true; // 아이디와 비번이 같으면 로그인 성공
//	        }
//		}
//		return false;
//	}
	
	public boolean login(User user) {
		//아이디를 검사
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
		//비밀번호 검사
			if(userInDb.getPassword().equals(user.getPassword())) {
				userId =  userInDb.getId();
				return true;
			}
		}
		return false;
	}
	
	//로그아웃 로그아웃버튼누르면 초기화
	public void logout() {
		userId = null;
	}
	
	//암호화 비밀번호 받아서 아스크코드로 변환
	public String encryption(String password) {
		String enc = "";
		for(int i=0; i<password.length(); i++) {
			enc += (char)(password.charAt(i)*KEY);
		}
		return enc;
	}
	//비밀번호 변경(마이페이지)
	//비밀번호 변경(비밀번호 변경 30일)
	//인증번호 전송
	//인증번호 생성
	//인증번호 확인
	public static void main(String[] args) {
		UserField userfield = new UserField();
		System.out.println(userfield.encryption("fadfadfadfad"));
	}
}
