package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    private Principal principal;

    @BeforeEach
    void setUp() {
        principal = new Principal("name");
    }

    @Test
    void getName() {
        assertEquals("name", principal.getName());
    }

    @Test
    void testEquals() {
        Principal principalTwin = new Principal("name");
        assertTrue(principal.equals(principalTwin));
    }

    @Test
    void testToString(){
        assertEquals("Principal{name='name'}", principal.toString());
    }
}