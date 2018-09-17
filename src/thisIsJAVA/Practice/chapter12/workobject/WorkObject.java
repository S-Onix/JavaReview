package thisIsJAVA.Practice.chapter12.workobject;

public class WorkObject {
    public synchronized void method1(){
        System.out.println("th1 method1 execution");
        notify();
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized  void mehtod2(){
        System.out.println("th2 method2 execution");
        notify();
        try{
            wait();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
