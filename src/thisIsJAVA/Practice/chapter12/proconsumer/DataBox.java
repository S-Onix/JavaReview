package thisIsJAVA.Practice.chapter12.proconsumer;

public class DataBox {
    //데이터를 소비하는 쪽과 데이터를 제공하는 쪽이 있어야함
    // 그리고 데이터는 소비되지 않으면 안됨

    private String data;

    public synchronized String getData(){
        if(this.data == null){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String tempData = data;
        this.data = null;
        System.out.println("가져온 데이터 : " + tempData);
        notify();
        return tempData;

    }

    public synchronized  void setData(String data){
        if(this.data != null){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("제공한 데이터 : " + data);
        notify();
    }

}

