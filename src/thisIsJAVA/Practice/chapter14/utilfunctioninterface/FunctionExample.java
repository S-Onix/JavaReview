package thisIsJAVA.Practice.chapter14.utilfunctioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", 70,80),
            new Student("아무개",90,90)
    );

    public static void printString(Function<Student,String> function){
        for(Student student : list){
            System.out.println(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function){
        for(Student student : list){
            System.out.println(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("[학생이름]");
        printString(t->t.getName());

        System.out.println("[영어점수]");
        printInt(t->t.getEnglishScore());

        System.out.println("[수학점수]");
        printInt(t->t.getMathScore());
    }


}
