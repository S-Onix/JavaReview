package thisIsJAVA.Practice.chapter12.proconsumer;

public class producerThread extends Thread{
    private DataBox db;

    public producerThread(DataBox db){
        this.db = db;
    }
    @Override
    public void run(){
        StringBuilder data = new StringBuilder();
        for(int i = 0 ; i < 20; i ++){
            data.append("Data").append(i);
            db.setData(data.toString());
            data.replace(0,data.length(), "");

        }
    }
}
