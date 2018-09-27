package thisIsJAVA.Practice.chapter14.andthenexample;

import java.util.function.Consumer;

public class ConsumerAndthenExample {
    public static void main(String[] args) {
        Consumer<Member> consumerA = (member) -> {
            System.out.println("consumerA : " + member.getName());
        };

        Consumer<Member> consumerB = (member) -> {
            System.out.println("consumerB : " + member.getId());
        };

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("홍길동", "아이디", null));
    }
}
