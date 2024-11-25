package com.kodilla.bank.homework;

public class CashMachine {
    private int id;
    private double[] transactions;
    private int size;
    private double balance;
    private int depositCount;
    private int withdrawCount;
    private double depositSum;
    private double withdrawSum;


    public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
        this.balance = 0;
        this.depositCount = 0;
        this.withdrawCount = 0;
        this.depositSum = 0;
        this.withdrawSum = 0;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = amount;
            this.transactions = newTab;
            this.depositCount++;
            this.depositSum = this.depositSum + amount;
        }
    }

    public void withdrawCash(double amount) {
        if (amount > 0) {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = -amount;
            this.transactions = newTab;
            this.withdrawCount++;
            this.withdrawSum = this.withdrawSum -amount;
        }
    }

    public int getTransactionsCount() {
        return transactions.length;
    }

    public double getBalance(){
        for (int i = 0; i < transactions.length; i++){
            this.balance = this.balance + transactions[i];
        }
        return this.balance;
    }

    public double getDepositCount(){
        return this.depositCount;
    }

    public double getWithdrawCount(){
        return this.withdrawCount;
    }

    public double getDepositSum(){
        return this.depositSum;
    }

    public double getWithdrawSum(){
        return this.withdrawSum;
    }

}
