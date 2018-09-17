package thisIsJAVA.Practice.chapter11.clone;

public class CloneExample {
    public void run(){
        Thinclone original = new Thinclone("홍길동",12);
        Thinclone clone = original.getClone();

        clone.number = 100;

        System.out.println("original");
        System.out.println(original.id);
        System.out.println(original.number);

        System.out.println("clone");
        System.out.println(clone.id);
        System.out.println(clone.number);


    }
}
