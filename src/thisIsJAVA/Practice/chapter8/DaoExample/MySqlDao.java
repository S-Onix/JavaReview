package thisIsJAVA.Practice.chapter8.DaoExample;

public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("MySqlDao select");
    }

    @Override
    public void delete() {
        System.out.println("MySqlDao delete");

    }

    @Override
    public void update() {
        System.out.println("MySqlDao update");

    }

    @Override
    public void insert() {
        System.out.println("MySqlDao insert");

    }
}
