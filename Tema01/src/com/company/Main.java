package com.company;
import com.company.bank.*;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("Bank management system");
        System.out.println("Choose an option:");
        System.out.println("1. Create a new normal account");
        System.out.println("2. Create a new limited transactions account");
        System.out.println("3. Create a new savings account");
        System.out.println("4. Withdraw money from account");
        System.out.println("5. Deposit money into account");
        System.out.println("6. Show account info");
        System.out.println("7. Show bank info");
        System.out.println("8. Exit");
    }

    public static void main(String[] args) {
        Bank bank = new Bank("BNR");
        int option;
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            showMenu();
            option = scan.nextInt();
            double balance;
            double limit;
            int accNumber;
            Account1 account;
            switch (option) {
                case 1:
                    System.out.println("Enter the account starting balance:");
                    balance = scan.nextDouble();
                    bank.createAccount(Bank.ACCOUNT_TYPE.NORMAL_ACCOUNT, balance);
                    System.out.println("Normal account created:");
                    break;
                case 2:
                    System.out.println("Enter the account starting balance:");
                    balance = scan.nextDouble();
                    System.out.println("Enter the account transaction limit:");
                    limit = scan.nextDouble();
                    bank.createAccount(Bank.ACCOUNT_TYPE.LIMITED_TRANSACTIONS_ACCOUNT, balance, limit);
                    System.out.println("Limited transactions account created:");
                    break;
                case 3:
                    System.out.println("Enter the account starting balance:");
                    balance = scan.nextDouble();
                    System.out.println("Enter the account minimum balance limit:");
                    limit = scan.nextDouble();
                    bank.createAccount(Bank.ACCOUNT_TYPE.SAVINGS_ACCOUNT, balance, limit);
                    System.out.println("Savings account created:");
                    break;
                case 4:
                    System.out.println("Enter the account number:");
                    accNumber = scan.nextInt();
                    account = bank.getAccountByAccNumber(accNumber);
                    if (account == null) {
                        System.out.println("No account found with this account number");
                    } else {
                        System.out.println("Enter the amount to be withdrawn:");
                        double withdrawAmount = scan.nextDouble();
                        double amountWithdrawn = account.withdraw(withdrawAmount);
                        System.out.println("Withdrawn " + amountWithdrawn + " money from the account");
                    }
                    break;
                case 5:
                    System.out.println("Enter the account number:");
                    accNumber = scan.nextInt();
                    account = bank.getAccountByAccNumber(accNumber);
                    if (account == null) {
                        System.out.println("No account found with this account number");
                    } else {
                        System.out.println("Enter the amount to be deposited:");
                        double depositAmount = scan.nextDouble();
                        double oldBalance = account.getBalance();
                        System.out.println("Old account balance: " + oldBalance);
                        double newBalance = account.deposit(depositAmount);
                        System.out.println("New account balance: " + newBalance);
                        System.out.println("Deposited amount: " + (newBalance - oldBalance));
                    }
                    break;
                case 6:
                    System.out.println("Enter the account number:");
                    accNumber = scan.nextInt();
                    account = bank.getAccountByAccNumber(accNumber);
                    if (account == null) {
                        System.out.println("No account found with this account number");
                    } else {
                        System.out.println("Account information:");
                        System.out.println(account.toString());
                    }
                    break;
                case 7:
                    System.out.println("Bank info:");
                    bank.showBankInfo();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

}
