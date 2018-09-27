package thisIsJAVA.Practice.chapter14.andthenexample;

public class Member {
    private String name;
    private String id;
    private Address adress;

    public Member(String name, String id, Address adress) {
        this.name = name;
        this.id = id;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAdress() {
        return adress;
    }
}
