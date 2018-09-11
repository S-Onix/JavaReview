package thisIsJAVA.Practice.chapter6.account;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner1 = new Scanner(System.in);
    private static Scanner scanner2 = new Scanner(System.in);


    public void applicationStart() {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("1. 계좌 생성  2. 계좌목록  3. 예금  4. 출금  5. 종료");
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.print(">> 선택");

            int selector = scanner1.nextInt();

            switch (selector) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
            }



        }
        System.out.println("종료합니다");

        scanner1.close();
    }

    private static void createAccount() {

        System.out.println("계정생성");
        System.out.println("-------------------");
        System.out.print("계좌번호 : ");
        String ano = scanner2.next();

        System.out.print("계좌주 : ");
        String name = scanner2.next();

        System.out.print("초기입금액 : ");
        int balance = scanner2.nextInt();


        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account(ano, name, balance);
                System.out.println("계좌가 생성되었습니다");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.print("계좌목록");
        System.out.print("---------------------");
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.println(accountArray[i].getAno() + "    " + accountArray[i].getName() + "    " + accountArray[i].getBalance());
            } else {
                break;
            }
        }
    }

    private static void deposit() {
        System.out.println("예금");
        System.out.println("---------------------");

        System.out.print("계좌번호 : ");
        String ano = scanner2.next();

        System.out.print("예금액: ");
        int plus = scanner2.nextInt();
        findAccount(ano).setBalance(findAccount(ano).getBalance() + plus);
        System.out.println("예금에 성공했습니다");


    }

    private static void withdraw() {
        System.out.println("출금");
        System.out.println("---------------------");

        System.out.print("계좌번호 : ");
        String ano = scanner2.next();

        System.out.print("출금액: ");
        int minus = scanner2.nextInt();
        findAccount(ano).setBalance(findAccount(ano).getBalance() - minus);
        System.out.println("출금에 성공했습니다");

    }

    private static Account findAccount(String ano) {
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        return null;
    }
}

