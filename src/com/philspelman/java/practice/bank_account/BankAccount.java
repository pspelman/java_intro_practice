package com.philspelman.java.practice.bank_account;

public class BankAccount {

// DONE: add attributes
// DONE: Create a class member (static) that has the number of accounts created thus far.
// DONE: Create a class member (static) that tracks the total amount of money stored in every account created.
    private String account_number;
    private double checking_balance;
    private double savings_balance;

    private static int totalAccountsCreated;
    private static double totalBankWorth;

    // DONE: Create a private method that returns a random ten digit account number.

    private String generateAccountNumber() {
        int min = 0;
        int max = 9;
        String accountNumber = "";
        for (int i = 0; i < 10; i++) {
            accountNumber += getRandIntBetween(min, max);
        }
        return accountNumber;
    }

    private static int getRandIntBetween(int lower_limit, int upper_limit) {
        return (int) Math.floor((Math.random() * (upper_limit - lower_limit + 1) + lower_limit));
    }

// DONE: In the constructor, be sure to increment the account count.
// DONE: In the constructor, call the private method from above so that each user has a random ten digit account.

    public BankAccount() {
        this(0, 0);
    }

    public static void main(String[] args) {
        System.out.println("Making bank acounts and stuff");

    }

    public BankAccount(double checking_balance, double savings_balance) {
        this.account_number = generateAccountNumber();
        this.checking_balance = checking_balance;
        this.savings_balance = savings_balance;

        totalAccountsCreated++;

    }


    // DONE: Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checking_balance;
    }
    // DONE: Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return savings_balance;
    }


    // DONE: Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void addToChecking(double addAmount) {
        totalBankWorth += addAmount;
        this.checking_balance += addAmount;
    }

    public void addToSavings(double addAmount) {
        totalBankWorth += addAmount;
        this.savings_balance += addAmount;
    }

// DONE: Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public double withdrawFromChecking(double withdrawalAmount) {
        //check available amount
        if (this.checking_balance < withdrawalAmount) {
            System.out.println("Insufficient funds. Try making money first.");
            return 0;
        } else {
            this.checking_balance -= withdrawalAmount;
            totalBankWorth -= withdrawalAmount;
            System.out.println("here's your money!");
            return withdrawalAmount;
        }
    }
    public double withdrawFromSavings(double withdrawalAmount) {
        if (this.savings_balance < withdrawalAmount) {
            System.out.println("Insufficient funds. Try making money first.");
            return 0;
        } else {
            this.savings_balance -= withdrawalAmount;
            totalBankWorth -= withdrawalAmount;
            System.out.println("here's your money!");
            return withdrawalAmount;
        }
    }

// DONE: Create a method to see the total money from the checking and saving.
    public double getCombinedBalance() {
        System.out.printf("checking: $%.2f %nsavings: $%.2f %nTotal: %.2f %n", getCheckingBalance(), getSavingsBalance(), (getCheckingBalance() + getSavingsBalance()));

        return getCheckingBalance() + getSavingsBalance();
    }
// DONE: Users should not be able to set any of the attributes from the class.

    @Override
    public String toString(){
        return this.account_number;
    }


}
