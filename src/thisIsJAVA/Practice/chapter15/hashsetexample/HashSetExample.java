package thisIsJAVA.Practice.chapter15.hashsetexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void start2(){
        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("1");

        int size = set.size();
        System.out.println("hashset size : "+size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        set.remove("1");
        set.remove("5");

        System.out.println("hashset size : "+set.size());

        iterator = set.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }

}
