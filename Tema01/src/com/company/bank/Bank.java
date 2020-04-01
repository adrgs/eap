package com.company.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    List<Account1> accounts;

    public Bank(String name) {
        this.setName(name);
        this.accounts = new ArrayList<>();
    }

    public void createAccount(AccountType accountType, double balance) {
        if (accountType == AccountType.NORMAL_ACCOUNT) {
            this.accounts.add(new Account1(balance, this.accounts.size()));
        }
    }

    public void createAccount(AccountType accountType, double balance, double limit) {
        if (accountType == AccountType.LIMITED_TRANSACTIONS_ACCOUNT) {
            this.accounts.add(new Account2(balance, this.accounts.size(), limit));
        } else if (accountType == AccountType.SAVINGS_ACCOUNT) {
            this.accounts.add(new Account3(balance, this.accounts.size(), limit));
        }
    }

    public Account1 getAccountByAccNumber(int accNumber) {
        if (accNumber < 0 || accNumber >= this.accounts.size()) return  null;
        return this.accounts.get(accNumber);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBankInfo() {
        String s = "";
        for (int i=0;i<this.accounts.size();i++) {
            s += this.accounts.get(i).toString();
            if (i!=this.accounts.size()-1)
            {
                s += "\n";
            }
        }
        System.out.println(this.toString() + s);
    }

    @Override
    public String toString()
    {
        String s = "Bank: " + this.name;
        if (this.accounts.size()>0) {
            s+= " Accounts:\n";
        } else {
            s+= " No accounts open";
        }
        return s;
    }
}
