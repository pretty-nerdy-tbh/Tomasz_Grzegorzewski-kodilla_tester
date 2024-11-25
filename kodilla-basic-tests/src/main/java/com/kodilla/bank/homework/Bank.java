package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachinesList;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachinesList = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachinesList, 0, newTab, 0, cashMachinesList.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachinesList = newTab;
    }

    public double getTotalBalance(){
        double totalBalance = 0;
        for (int i = 0; i < cashMachinesList.length; i++){
            totalBalance = totalBalance + cashMachinesList[i].getBalance();
        }
        return totalBalance;
    }

    public double getTotalWithdrawCount(){
        double totalWithdrawCount = 0;
        for (int i = 0; i < cashMachinesList.length; i++){
            totalWithdrawCount = totalWithdrawCount + cashMachinesList[i].getWithdrawCount();
        }
        return totalWithdrawCount;
    }

    public double getTotalDepositCount(){
        double totalDepositCount = 0;
        for (int i = 0; i < cashMachinesList.length; i++){
            totalDepositCount = totalDepositCount + cashMachinesList[i].getDepositCount();
        }
        return totalDepositCount;
    }

    public double getTotalWithdrawAverage() {
        double totalWithdrawSum = 0;
        double totalWithdrawCount = 0;
        double totalWithdrawAverage = 0;
        for (int i = 0; i < cashMachinesList.length; i++){
            totalWithdrawSum = totalWithdrawSum + cashMachinesList[i].getWithdrawSum();
        }
        for (int i = 0; i < cashMachinesList.length; i++){
            totalWithdrawCount = totalWithdrawCount + cashMachinesList[i].getWithdrawCount();
        }
        totalWithdrawAverage = totalWithdrawSum/totalWithdrawCount;
        return totalWithdrawAverage;
    }

    public double getTotalDepositAverage() {
        double totalDepositSum = 0;
        double totalDepositCount = 0;
        double totalDepositAverage = 0;
        for (int i = 0; i < cashMachinesList.length; i++){
            totalDepositSum = totalDepositSum + cashMachinesList[i].getDepositSum();
        }
        for (int i = 0; i < cashMachinesList.length; i++){
            totalDepositCount = totalDepositCount + cashMachinesList[i].getDepositCount();
        }
        totalDepositAverage = totalDepositSum/totalDepositCount;
        return totalDepositAverage;
    }

    public CashMachine[] getCashMachinesList() {
        return cashMachinesList;
    }
}
