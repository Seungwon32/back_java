package collectionTest.hashMapTest;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "bsw1234");
		userMap.put("password", "2134");
		userMap.put("name", "배승원");
		userMap.put("age", 23);
		userMap.put("isRich", true);
		
		System.out.println(userMap.get(userMap));
		System.out.println(userMap.get(userMap.get("age")));
		System.out.println(userMap.entrySet());
		
		
		Iterator<Entry<String, Object>> userMapEntrySet = userMap.entrySet().iterator();
		while(userMapEntrySet.hasNext()) {
			Entry<String,Object> entry = userMapEntrySet.next();
			System.out.println(entry.getKey());
		}
		
	}
}
