package thisIsJAVA.Practice.chapter13.genericboxex;

public class BoxG <T> {
    private T t;
    public T get(){
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}
