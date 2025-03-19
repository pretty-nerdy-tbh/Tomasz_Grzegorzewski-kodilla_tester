package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {

    private Grades grades;

    @BeforeEach
    void setUp() {
        List<Double> gradesInput = new ArrayList<>();
        gradesInput.add(3.0);
        gradesInput.add(4.0);
        gradesInput.add(5.0);
        grades = new Grades(gradesInput);
    }

    @Test
    void getAverage() {
        assertEquals(4.0, grades.getAverage());
    }
}