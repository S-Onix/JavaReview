package thisIsJAVA.Practice.chapter15.hashmapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void start4(){
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student("홍길동", 15),1);
        map.put(new Student("홍길동", 15),1);

        System.out.println(map.size());
    }
}
