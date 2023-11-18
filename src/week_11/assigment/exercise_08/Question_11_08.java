package week_11.assigment.exercise_08;

import java.util.ArrayList;

public class Question_11_08 {
    public static void main(String[] args) {
        Account account = new Account(1122, 1000, 1.5, "George");
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);
        System.out.println(account.getTransactions());
    }
}
