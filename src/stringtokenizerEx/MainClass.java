package stringtokenizerEx;

import java.util.StringTokenizer;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "aasdf bv casdfac dq e f g e";
		String str2 = "12444/5/8/4/3";
		
		StringTokenizer to1 = new StringTokenizer(str1);
		StringTokenizer to2 = new StringTokenizer(str2, "/");
		
		System.out.println("to1의 문자열 수 : " + to1.countTokens());
		System.out.println("to2의 문자열 수 : " + to2.countTokens());
	
		while(to1.hasMoreTokens()) {
			System.out.println(to1.nextToken());
			
		}
		while(to2.hasMoreElements()) {
			System.out.println(to2.nextElement());
		}
	}
}
