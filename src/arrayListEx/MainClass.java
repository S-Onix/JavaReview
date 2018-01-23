package arrayListEx;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> arrayStr = new ArrayList<>();
		
		arrayStr.add("str0");
		arrayStr.add("str1");
		arrayStr.add("str2");
		arrayStr.add("str3");
		arrayStr.add("str4");
		
		System.out.println(arrayStr.toString());
		
		arrayStr.set(3, "modify");
		System.out.println(arrayStr.get(3));
		
		arrayStr.remove(3);
		System.out.println(arrayStr.toString());
		
		int size = arrayStr.size();
		System.out.println("arrayStr Size : " + size);
		
		arrayStr.clear();
		System.out.println(arrayStr.toString());
		
		arrayStr = null;
		System.out.println(arrayStr);
		System.out.println(arrayStr.toString());
		
	}
}
