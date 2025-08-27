package abstractTest;

public class Dog implements Pet, Animal{
	 @Override
	public void poop() {
		System.out.println("강아지");
		
	}
	 
	 @Override
	public void sitDown() {
		 System.out.println("강아지 앉아");
		
	}
	 
	@Override
	public void waitNow() {
		System.out.println("강아지 기다려");
		
	}
}
