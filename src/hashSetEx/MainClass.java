package hashSetEx;

import java.util.HashSet;

public class MainClass {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("이순신", 3));
		hashSet.add(new Student("홍길동", 6));
		hashSet.add(new Student("장보고", 1));
		
		
		Student student = new Student("이순신", 3);
		hashSet.remove(student);
		System.out.println(hashSet.toString());
		
	}
}
