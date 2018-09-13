package thisIsJAVA.Practice.chapter8.DaoExample;

public class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Oracle select");

    }

    @Override
    public void delete() {
        System.out.println("Oracle delete");

    }

    @Override
    public void update() {
        System.out.println("Oracle update");

    }

    @Override
    public void insert() {
        System.out.println("Oracle insert");

    }
}
