package thisIsJAVA.Practice.chapter15.hashsetexample2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void start3(){
        Set<Member> set = new HashSet<>();

        set.add(new Member("아무개", 15));
        set.add(new Member("아무개", 15));

        System.out.println("총 객체수 : " + set.size());
    }
}
