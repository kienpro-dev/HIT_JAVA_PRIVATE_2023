package ViDuTrenLop;

import objects.Account;

public class Bai1 {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Kien", 1000000);
        account1.display();
        account1.deposit(100000);
        account1.display();
        account1.withdraw(200000);
        account1.display();
        account1.withdraw(2000000);
        account1.display();
    }
}
