package thisIsJAVA.Practice.chapter13.genericmethod;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(1, "사과");
        Pair<Integer,String> p2 = new Pair<>(1, "사과");

        if(Util.compare(p1,p2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

        Pair<String,String> p3 = new Pair<>("1", "사과");
        Pair<String,String> p4 = new Pair<>("2", "사과");

        if(Util.compare(p3,p4)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
