package collectionTest.ArrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeMessage.RecipientType;

public class UserField {
//	users를 db라고 생각하기
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	public static String code;
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
	
	//비밀번호 변경(마이페이지)   기존 비번,확인/ 새비번확인,한번더입력, 전과 다른지 확인
//	public void changePassword(String oldPassword, String newPassword, String newPassword2) {
//		User userInDb = checkId(userId);
//		if(oldPassword.equals(userInDb.getPassword())) {
//			if(!newPassword.equals(oldPassword)) {
//				if(newPassword.equals(newPassword2)) {
//					userInDb.setPassword(newPassword);
//					System.out.println("변경완료");
//				}
//			}
//		}
//	}
	
	public void update(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			userInDb.setPassword(encryption(user.getPassword()));
		}
	}
	
	//비밀번호 변경(비밀번호 변경 30일)
	public void update(String newPassword) {
		User userInDb = checkId(userId);
		if(userInDb != null) {
			userInDb.setPassword(encryption(newPassword));
		}
	}
	//인증번호 생성
	public String randomNumber() {
		String code = "";
		for(int i=0; i<6; i++) {
			code +=(int)(Math.random()*10);
			this.code = code;
		}
		return code;
	}
	
	//인증번호 전송
	public void sendEmail(String toMemberEmail) {
		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "메일 발송 테스트";
        
        //보낸 이메일 작성
        String fromEmail = "bsw030722@gmail.com";
        String fromUsername = "배승원";
        
        String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "bsw030722@gmail.com";         
        final String password = "etjf zxyc umxm cnmp";
        
        //랜덤 코드 생성
        this.randomNumber();
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<h3>인증번호발송</h3>\n");
        sb.append("<h4>[인증번호 6자리]</h4>\n");    
        sb.append("<h4>"+ code + "</h4>\n");    
        sb.append("<h4>테스트 발송</h4>\n");    
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
	}
	
	//인증번호 확인
	public boolean checkCode(String inputCode) {
		return code.equals(inputCode);
	}
	
	public static void main(String[] args) {
		UserField userfield = new UserField();
		Scanner sc = new Scanner(System.in);
		String message = "인증번호를 입력하세요", inputCode = null;
		int errorCount = 0;
		
		System.out.println(userfield.encryption("fadfadfadfad"));
		
		
		userfield.randomNumber();
		userfield.sendEmail("bsw030722@gmail.com");
		
		//이메일 인증번호 확인
		do {
			if(errorCount == 0) {
				System.out.println(message);
				inputCode = sc.nextLine().trim();
			}else if(errorCount > 0 && errorCount < 3) {
				System.out.println("다시 입력하세요");
				inputCode = sc.nextLine().trim();
			}else if(errorCount == 3) {
				System.out.println("처음부터 다시 인증해주세요");
				break;
			}
			errorCount++;
		}while(!userfield.checkCode(inputCode));
		
		if(userfield.checkCode(inputCode)) {
			System.out.println("인증완료");
		}else {
			System.out.println("인증실패");
		}
	}
}
