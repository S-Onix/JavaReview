package thisIsJAVA.Practice.chapter7.parent;

public class Child extends Parent {
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Chile() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
