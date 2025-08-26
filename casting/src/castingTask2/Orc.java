package castingTask2;
//오크 클래스 - 도끼
//콜록!을 출력하는 메서드
public class Orc extends Monster{
	  {
	      this.name = "오크";
	      this.item = "도끼";
	      this.hp = 10;
	   }
	   
	   public Orc() {;}
	//   public Orc(String name, String item, int hp) {
//	      super(name, item, hp);
	//   }
	   
	   void speak() {
	      System.err.println("콜록!");
	   }
}
