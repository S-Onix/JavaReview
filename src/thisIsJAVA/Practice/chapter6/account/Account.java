package thisIsJAVA.Practice.chapter6.account;

public class Account {
    private String Ano;
    private String name;
    private int balance;

    public Account (String ano, String owner, int balance) {
        this.Ano = ano;
        this.name = owner;
        this.balance = balance;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
