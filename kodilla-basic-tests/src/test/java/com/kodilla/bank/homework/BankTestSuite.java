package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;

    @BeforeEach
    void setup() {
        bank = new Bank();
    }

    @Test
    public void shouldHaveZeroLength() {
        assertEquals(0, bank.getTotalBalance(), 0.01);
        assertEquals(0, bank.getTotalDepositCount());
        assertEquals(0, bank.getTotalWithdrawCount());
        CashMachine[] cashMachinesList = bank.getCashMachinesList();
        assertEquals(0, cashMachinesList.length);
    }

    @Test
    public void shouldAddTwoElementsToArray(){
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());

        CashMachine[] cashMachinesList = bank.getCashMachinesList();
        assertEquals(2, cashMachinesList.length);
    }

    @Test
    public void shouldCalculateBalance() {
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());

        bank.getCashMachinesList()[0].depositCash(2500);
        bank.getCashMachinesList()[0].withdrawCash(3000);
        bank.getCashMachinesList()[0].depositCash(4500);
        bank.getCashMachinesList()[0].depositCash(-1500);

        bank.getCashMachinesList()[1].depositCash(2500);
        bank.getCashMachinesList()[1].depositCash(3500);
        bank.getCashMachinesList()[1].withdrawCash(4000);
        bank.getCashMachinesList()[1].depositCash(-500);

        bank.getCashMachinesList()[2].withdrawCash(2000);
        bank.getCashMachinesList()[2].depositCash(3500);
        bank.getCashMachinesList()[2].depositCash(4500);
        bank.getCashMachinesList()[2].depositCash(-800);

        assertEquals(12000, bank.getTotalBalance(), 0.01);
    }

    @Test
    public void shouldCalculateTotalWithdrawAndDepositCount() {
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());

        bank.getCashMachinesList()[0].depositCash(2500);
        bank.getCashMachinesList()[0].withdrawCash(3000);
        bank.getCashMachinesList()[0].depositCash(4500);
        bank.getCashMachinesList()[0].depositCash(-1500);

        bank.getCashMachinesList()[1].depositCash(2500);
        bank.getCashMachinesList()[1].depositCash(3500);
        bank.getCashMachinesList()[1].withdrawCash(4000);
        bank.getCashMachinesList()[1].depositCash(-500);

        bank.getCashMachinesList()[2].withdrawCash(2000);
        bank.getCashMachinesList()[2].depositCash(3500);
        bank.getCashMachinesList()[2].depositCash(4500);
        bank.getCashMachinesList()[2].depositCash(-800);

        assertEquals(3, bank.getTotalWithdrawCount(), 0.01);
        assertEquals(6, bank.getTotalDepositCount(), 0.01);
    }

    @Test
    public void shouldCalculateTotalWithdrawAndDepositAverage() {
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());
        bank.addCashMachine(new CashMachine());

        bank.getCashMachinesList()[0].depositCash(2500);
        bank.getCashMachinesList()[0].withdrawCash(3000);
        bank.getCashMachinesList()[0].depositCash(4500);
        bank.getCashMachinesList()[0].depositCash(-1500);

        bank.getCashMachinesList()[1].depositCash(2500);
        bank.getCashMachinesList()[1].depositCash(3500);
        bank.getCashMachinesList()[1].withdrawCash(4000);
        bank.getCashMachinesList()[1].depositCash(-500);

        bank.getCashMachinesList()[2].withdrawCash(2000);
        bank.getCashMachinesList()[2].depositCash(3500);
        bank.getCashMachinesList()[2].depositCash(4500);
        bank.getCashMachinesList()[2].depositCash(-800);

        assertEquals(3500, bank.getTotalDepositAverage(), 0.01);
        assertEquals(-3000, bank.getTotalWithdrawAverage(), 0.01);
    }


}
