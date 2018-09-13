package thisIsJAVA.Practice.chapter8;

import thisIsJAVA.Practice.chapter8.DaoExample.DataAccessObject;
import thisIsJAVA.Practice.chapter8.DaoExample.MySqlDao;
import thisIsJAVA.Practice.chapter8.DaoExample.OracleDao;
import thisIsJAVA.Practice.chapter8.action.Action;

public class Main {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());

        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("copy start");
            }
        };
        action.work();
    }
}
