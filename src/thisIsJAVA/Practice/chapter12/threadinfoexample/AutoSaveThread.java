package thisIsJAVA.Practice.chapter12.threadinfoexample;

public class AutoSaveThread extends Thread{

    public void save(){
        System.out.println("save program");
    }

    @Override
    public void run(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        save();

    }
}

