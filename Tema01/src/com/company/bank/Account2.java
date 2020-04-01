package com.company.bank;

public class Account2 extends Account1 { // Contul Tranzactii limitate
    private double maxWithdraw;

    public Account2(double balance, int accNumber, double maxWithdraw) {
        super(balance, accNumber);
        this.setMaxWithdraw(maxWithdraw);
    }

    public double getMaxWithdraw() {
        return maxWithdraw;
    }

    public void setMaxWithdraw(double maxWithdraw) {
        if (maxWithdraw < 0) {
            maxWithdraw = Double.POSITIVE_INFINITY;
        } else {
            this.maxWithdraw = maxWithdraw;
        }
    }

    @Override
    public double withdraw(double sum) {
        if (sum > this.maxWithdraw) return 0;
        return super.withdraw(sum);
    }

    @Override
    public String toString()
    {
        return super.toString() + " Maximum withdraw:" + this.maxWithdraw;
    }
}
