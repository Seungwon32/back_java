package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		.size 배열리스트의 크기를 알려줌
		System.out.println(datas.size());
//		.add(값)
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(20);
		datas.add(80);
		datas.add(90);
		datas.add(11);
		datas.add(15);
		datas.add(85);
		datas.add(25);
		System.out.println(datas.size());
		System.out.println(datas);
//		alt + shift + z ,,try~catch문
		try {
			System.out.println(datas.get(0));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 예외 발생");
			System.out.println("인덱스 범위를 똑바로 작성하세요");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		추가(삽입)
//		50뒤에 500을 삽입
		Collections.shuffle(datas);
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50)+1,500);
		}
		System.out.println(datas);
		
//		수정
//		90을 9로 수정
		int prev = 0;
		try {
			if(datas.contains(90)) {
			prev = datas.set(datas.indexOf(90), 9);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(datas);
//		삭제
//		80을 삭제  
//		1.인덱스로 지우기
		if(datas.contains(80)) {
			datas.remove(datas.indexOf(datas));
		}
		
	}
}
