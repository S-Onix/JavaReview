package thisIsJAVA.Practice.chapter12.proconsumer;

public class WaitNotifyExample {
    public static void main(String[] args) {
        DataBox db = new DataBox();

        consumeThread ct = new consumeThread(db);
        producerThread pt = new producerThread(db);

        ct.start();
        pt.start();
    }
}
