package thisIsJAVA.Practice.chapter12.sumthreadex;

public class SumThread extends Thread {
    private long sum;

    public long getSum(){
        return this.sum;
    }

    public void run(){
        for (int i = 0; i < sum; i++) {
            this.sum += i;
        }
    }
}
