package thisIsJAVA.Practice.chapter7.parent;

public class Parent {
    private String name;

    public Parent(){
        this("대한민국");
        System.out.println("Parnt() call");
    }

    public Parent(String name) {
        this.name = name;
        System.out.println("Parnt(String name) call");
    }
}
