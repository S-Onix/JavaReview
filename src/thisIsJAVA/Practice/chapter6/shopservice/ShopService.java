package thisIsJAVA.Practice.chapter6.shopservice;

//싱글톤 패턴 만들기
public class ShopService {
    private static ShopService service = new ShopService();

    private ShopService(){

    }

    public static ShopService getInstance(){
        if(service == null){
            ShopService service = new ShopService();
        }
        return service;
    }
}
