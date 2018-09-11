package thisIsJAVA.Practice.chapter6;

import thisIsJAVA.Practice.chapter6.account.BankApplication;
import thisIsJAVA.Practice.chapter6.printer.Printer;

public class Main {
    public static void main(String [] args){
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("문자열");

        BankApplication account = new BankApplication();
        account.applicationStart();
    }

}
