package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		IntStream is = Arrays.stream(arr);
		int sum = is.sum();
		
		//is 는 소모됬기 때문에 재사용 할수 없다.
		//OptionalDouble average = is.average();
		
		
		System.out.println(sum);
		//System.out.println(average);
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tom");
		sList.add("Jack");
		sList.add("Paul");
		
		sList.stream().sorted().map(s->s.length()).forEach(s->System.out.print(s+"\t"));
		
		
	}
}
