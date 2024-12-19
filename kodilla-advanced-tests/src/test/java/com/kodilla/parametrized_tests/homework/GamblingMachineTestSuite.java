package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine;

    @BeforeEach
    void setup() {
        gamblingMachine = new GamblingMachine();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/setIntegerForGamblingMachineTest.csv", numLinesToSkip = 0)
    public void shouldReturnTrueForValidNumbers(String rawNumbers) throws InvalidNumbersException {
        System.out.println("Raw numbers: " + rawNumbers);
        Set<Integer> numbers = Arrays.stream(rawNumbers.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int winsCount = gamblingMachine.howManyWins(numbers);
        boolean result = false;
        if (winsCount < 7 && winsCount >= 0)
            result = true;
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/setIntegerForGamblingMachnieTest_InvalidNumbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionForInvalidNumbers(String rawNumbers) throws InvalidNumbersException {
        System.out.println("Raw numbers: " + rawNumbers);
        Set<Integer> numbers = Arrays.stream(rawNumbers.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}