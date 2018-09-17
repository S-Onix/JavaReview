package thisIsJAVA.Practice.chapter12.workobject;

public class workObjectMain {

    public static void main(String[] args) {
        WorkObject wo = new WorkObject();

        workThread1 th1 = new workThread1(wo);
        workThread2 th2 = new workThread2(wo);

        th1.start();
        th2.start();
    }
}
