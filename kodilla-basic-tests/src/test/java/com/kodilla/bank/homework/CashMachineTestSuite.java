package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine;

    @BeforeEach
    void setup() {
        cashMachine = new CashMachine();
    }

    @Test
    public void shouldHaveZeroLength() {
        assertEquals(0, cashMachine.getBalance(), 0.01);
        assertEquals(0, cashMachine.getTransactionsCount());
        assertEquals(0, cashMachine.getDepositCount());
        assertEquals(0, cashMachine.getWithdrawCount());
        assertEquals(0, cashMachine.getDepositSum(), 0.01);
        assertEquals(0, cashMachine.getWithdrawSum(), 0.01);
    }


    @Test
    public void shouldAddFourElementsToArrayIfAmountIsGreaterThanZero() {
        cashMachine.depositCash(280);
        cashMachine.depositCash(2422);
        cashMachine.withdrawCash(345);
        cashMachine.withdrawCash(1234);
        cashMachine.depositCash(-422);
        cashMachine.withdrawCash(-645);


        assertEquals(4, cashMachine.getTransactionsCount());
        assertEquals(2, cashMachine.getDepositCount());
        assertEquals(2, cashMachine.getWithdrawCount());
    }

    @Test
    public void shouldCalculateBalanceAndSum() {
        cashMachine.depositCash(400);
        cashMachine.depositCash(2000);
        cashMachine.withdrawCash(300);
        cashMachine.withdrawCash(1000);

        assertEquals(1100, cashMachine.getBalance(), 0.01);
        assertEquals(2400, cashMachine.getDepositSum(), 0.01);
        assertEquals(-1300, cashMachine.getWithdrawSum(), 0.01);
    }
}
