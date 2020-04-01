package com.company.bank;

public class Account3 extends Account1 { // Contul "Sa nu ramai pe 0"
    double minBalance;

    Account3(double balance, int accNumber, double minBalance) {
        super(balance, accNumber);
        this.setMinBalance(minBalance);
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        if (this.minBalance < 0) {
            this.minBalance = 0;
        } else {
            this.minBalance = minBalance;
        }
    }

    @Override
    public double withdraw(double sum) {
        if (sum > 0 && this.balance-sum >= this.minBalance) {
            this.balance -= sum;
            return sum;
        }
        return 0;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Minimum balance:" + this.minBalance;
    }
}
