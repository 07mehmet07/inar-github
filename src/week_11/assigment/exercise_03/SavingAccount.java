package week_11.assigment.exercise_03;

import week_09.assigment.Account;

public class SavingAccount extends Account {
    private int id;
    private double balance;

    public SavingAccount() {

    }

    public SavingAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return
                "ID : " + this.getId() +
                        "\nBalance is $" + this.getBalance();
    }
}
