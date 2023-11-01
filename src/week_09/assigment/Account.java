package week_09.assigment;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private final Date dateCreated = new Date();

    public Account() {


    }

    public Account(int specifiedId, int newBalance) {
        this.id = specifiedId;
        this.balance = newBalance;


    }

    public int getId() {
        return id;
    }

    public void getId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double setAnnualInterestRate(double newAnnualInterestRate) {
        return annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / (12 * 100);
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }


    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public String toString() {
        return "Account Statement :\n" +
                "-------------------------------------------" + "\n" +
                "Account ID      : " + this.id + "\n" +
                "Date created    : " + this.dateCreated + "\n" +
                "Balance         : $" + this.balance + "\n" +
                "Monthly Interest: $" + this.getMonthlyInterest();
    }
}
