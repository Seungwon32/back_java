package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//		메서드 선언
		MyInter myInter = new MyInter() {
			
			@Override
			public void getString(String content) {
//				ABCD를 전달하면 ABDE를 출력해주는 메서드
				String result="";
				for(int i=0; i<content.length(); i++) {
					char c =content.charAt(i);
					if(c !='c') {
						continue;
					}else {
						return result += c;
					}
				}
				
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
