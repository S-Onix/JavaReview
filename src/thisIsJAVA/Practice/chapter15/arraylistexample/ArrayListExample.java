package thisIsJAVA.Practice.chapter15.arraylistexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void start(){
        List<String> list = new ArrayList<>();
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("java1");
        list.add("홍길동3");
        list.add("java2");
        list.add("java3");

        int size = list.size();
        System.out.println("리스트의 크기 : " + size);

        list.add("java4");
        list.add("java5");

        size = list.size();
        System.out.println("리스트의 크기 : " + size);

        for(String string : list){
            System.out.println(string);
        }


        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

        System.out.println();
        System.out.println();


        for(int i = 3; i < 5; i++){
            list.remove(i);
        }

        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }

    }
}
