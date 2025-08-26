package castingTask2;
//요정 클래스 - 팬던트
//ㄱr끔 눈물을 흘린다...는 기능을 가진 메서드
public class Fairy extends Monster {
	{
	      this.name = "요정";
	      this.item = "팬던트";
	      this.hp = 5;
	   }
	   
	   public Fairy() {;}
	   
	   void crying() {
	      System.out.println("ㄱr끔 눈물을 흘린다...");
	   }
}
