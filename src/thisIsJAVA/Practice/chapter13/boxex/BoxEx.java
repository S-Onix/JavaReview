package thisIsJAVA.Practice.chapter13.boxex;

public class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.setBox("홍길동");
        String name = (String) box.getBox();

        box.setBox(new Apple());
        Apple ex = (Apple) box.getBox();
    }
}
