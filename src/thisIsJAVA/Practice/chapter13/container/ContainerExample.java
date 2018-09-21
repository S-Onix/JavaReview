package thisIsJAVA.Practice.chapter13.container;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container = new Container<>();
        container.set("홍길동", "의적");
        String name = container.getKey();
        String job = container.getValue();

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
    }

}
