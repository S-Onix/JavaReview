package mapEx;

import java.util.HashMap;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		hashMap.put(5, "str5");
		
		System.out.println(hashMap.toString());
		
		String str = hashMap.get(2);
		System.out.println(str);
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		hashMap.put(5, "str5");
		
		
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
		
		
	}
}
