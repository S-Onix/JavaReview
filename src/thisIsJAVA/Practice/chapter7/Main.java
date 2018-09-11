package thisIsJAVA.Practice.chapter7;

import thisIsJAVA.Practice.chapter7.parent.Child;
import thisIsJAVA.Practice.chapter7.tire.SnowTire;
import thisIsJAVA.Practice.chapter7.tire.Tire;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        SnowTire st = new SnowTire();
        Tire tire = st;

        st.run();
        tire.run();
    }
}
