package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonForTestingGetBMI")
    public void shouldCalculateStringLengthWithoutSpaces(PersonSources input) {
        Person personExample = input.getPerson();
        String expectedExample = input.getExpected();
        assertEquals(expectedExample, personExample.getBMI());
    }

}