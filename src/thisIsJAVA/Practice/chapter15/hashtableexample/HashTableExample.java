package thisIsJAVA.Practice.chapter15.hashtableexample;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("아이디와 패스워드를 입력하세요");
            System.out.print("아이디 : ");
            String id = scan.nextLine();

            System.out.print("비밀번호 : ");
            String password = scan.nextLine();

            System.out.println();

            if(map.containsKey(id)) {
                if (map.get(id).equals(password)){
                    System.out.println("로그인되었습니다");
                }else
                    System.out.println("비밀번호가 일치하지 않습니다");
            }else{
                System.out.println("아이디가 없습니다");
            }
        }

    }
}
