package thisIsJAVA.Practice.chapter12.workobject;

public class workThread1 extends Thread{
    private WorkObject workobejct;

    public workThread1(WorkObject workobject){
        this.workobejct = workobject;
    }

    @Override
    public void run(){
        for (int i = 0 ; i < 10; i++) {
            workobejct.method1();
        }
    }

}
