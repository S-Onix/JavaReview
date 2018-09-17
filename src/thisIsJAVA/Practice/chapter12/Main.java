package thisIsJAVA.Practice.chapter12;

import thisIsJAVA.Practice.chapter12.sumthreadex.SumThread;

public class Main {
    public static void main(String[] args) {
        SumThread sumth = new SumThread();
        sumth.start();

        try {
            sumth.join();
        }catch(InterruptedException e){}
        
        System.out.println(sumth.getSum());
    }
}
