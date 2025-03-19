package com.kodilla.collections.adv.maps.complex;

import com.kodilla.collections.adv.immutable.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("firstname", "lastname");
    }

    @Test
    void getFirstname() {
        assertEquals("firstname", student.getFirstname());
    }

    @Test
    void getLastname() {
        assertEquals("lastname", student.getLastname());
    }

    @Test
    void testEquals() {
        Student studentTwin = new Student("firstname", "lastname");
        assertTrue(student.equals(studentTwin));
    }
}