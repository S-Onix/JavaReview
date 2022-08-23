package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		if(t.getBytes().length >= u.getBytes().length) return t;
		else return u;
	}
	
}

public class StreamReducetest {
	public static void main(String[] args) {
		String greeting[] = {"HI", "hello", "good morning", "하이"};
		
		//람다식
		String str1 = Arrays.stream(greeting).reduce("", (s1, s2)-> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		});
		
		System.out.println(str1);
		
		//익명클래스
		String str2 = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str2);
	}
}
