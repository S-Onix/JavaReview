package thisIsJAVA.Practice.chapter12.workobject;

public class workThread2 extends Thread{
    private WorkObject workobject;

    public workThread2(WorkObject workobject){
        this.workobject = workobject;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 10; i++){
            workobject.mehtod2();
        }
    }
}
