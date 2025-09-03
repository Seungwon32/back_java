package collectionTest.hashMapTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//HashMap 자료구조
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"

//value들만 arrayList로 변경 후 출력

public class HashMapTask1 {
	public static void main(String[] args) {
//		HashMap<String, String> userMap = new HashMap<String, String>();
//		ArrayList<String> datas = new ArrayList<String>();
//		
//		userMap.put("street", "Victor Plains");
//		userMap.put("suite", "Suite 879");
//		userMap.put("city", "Wisokyburgh");
//		userMap.put("zipcode", "90566-7771");
//		userMap.put("lat", "-43.9509");
//		userMap.put("lng", "-34.4618");
//		
//		for(String value : userMap.values()) {
//            datas.add(value);
//        }
//		
//		System.out.println(datas);
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		
		userMap.put("street", "Victor Plains");
		userMap.put("suite", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
		
		System.out.println(new ArrayList(userMap.values()));
		
		Iterator<Entry<String,Object>> entry = userMap.entrySet().iterator();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		
		while(entry.hasNext()) {
			arrayList.add(entry.next().getValue());
		}
		System.out.println(arrayList);
	}
}
