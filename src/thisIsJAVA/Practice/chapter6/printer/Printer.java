package thisIsJAVA.Practice.chapter6.printer;

public class Printer<T> {
    public static <T> void println(T data){
        System.out.println(data);
    }
}
