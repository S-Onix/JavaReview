package thisIsJAVA.Practice.chapter12.proconsumer;

public class consumeThread extends Thread{
    private DataBox db = new DataBox();
    private String [] array;

    public consumeThread(DataBox db){
        this.db = db;
    }
    @Override
    public void run(){
        array = new String[20];
        for(int i = 0; i < 20; i++){
            array[i] = db.getData();
        }
    }
}
