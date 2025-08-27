package anonymousTask;

public interface Form {
//	메뉴등록
	public void registerMenus(String[] menus);
	
//	메뉴보기
//	계약할 때 판매할 메뉴를 보여주는 메서드
	public void showMenus();
	
//	메뉴 판매
//	해당 메뉴를 판매하는 메서드
//	판매중인 메뉴에 있으면 "판매완료", 아니라면 "판매 준비중"
	public void sell(String menu);
	
	
}
