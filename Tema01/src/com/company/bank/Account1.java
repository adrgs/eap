package com.company.bank;

public class Account1 {
    double balance;
    int accNumber;

    Account1(double balance, int accNumber) {
        if (balance < 0) {
            this.balance = 0;
        }
        else {
            this.balance = balance;
        }
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double deposit(double sum) {
        if (sum>0) {
            this.balance += sum;
        }
        return this.balance;
    }
    public double withdraw(double sum) {
        if (sum > 0 && sum < this.balance) {
            this.balance -= sum;
            return sum;
        }
        return 0;
    }

    @Override
    public String toString()
    {
        return "Account number:" + this.getAccNumber() + " Balance:" + this.getBalance();
    }

}
