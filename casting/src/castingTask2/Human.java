package castingTask2;
//휴먼 클래스 - 골드
//해치웠나..?를 출력하는 기능 메서드
public class Human extends Monster {
	{
	      this.name = "휴먼";
	      this.item = "골드";
	      this.hp = 1;
	   }
	   
	   public Human() {;}
	   
	   void cliche() {
	      System.out.println("해치웠나..?");
	   }
}
