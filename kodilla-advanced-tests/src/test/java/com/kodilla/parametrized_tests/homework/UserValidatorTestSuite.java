package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    @ParameterizedTest
    @CsvSource(value = {"User_123","Skyline2024","Beta-Test","Alpha.42","Neo.Frost"})
    public void shouldReturnTrueForValidUsernam(String username) {
        boolean result = UserValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"User–123","Skyline2@24","Be","42","\"Neo,Frost\""})
    public void shouldReturnFalseForInvalidUsernam(String username) {
        boolean result = UserValidator.validateUsername(username);
        System.out.println("|" + username + "|");
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"john.doe@example.com","alice_smith@mail.co","test-123@sub.domain.org","a@b.c","Neo.Frost@vmail.pl"})
    public void shouldReturnTrueForValidEmail(String username) {
        boolean result = UserValidator.validateEmail(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"john..doe@example.com","@example.com","john.doe@.com","john.doe@example.","Neo Frost@vmail.pl", "john.doe@example.toolong"})
    public void shouldReturnFalseForInvalidEmail(String email) {
        boolean result = UserValidator.validateEmail(email);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfStringIsEmptyOrNull(String email) {
        assertFalse(UserValidator.validateEmail(email));
    }

}