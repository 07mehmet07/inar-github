package week_11.assigment.exercise_03;

import week_09.assigment.Account;

public class CheckingAccount extends Account {

    private final double OVERDRAFT_LIMIT = -500;

    private int id;

    private double balance;


    public CheckingAccount() {

    }

    public CheckingAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }


    public double getOVERDRAFT_LIMIT() {
        return OVERDRAFT_LIMIT;
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
                        "\nBlance is $" + this.balance +
                        "\nLimit is $" + this.getOVERDRAFT_LIMIT() +
                        "\n---------------------------";


    }
}
