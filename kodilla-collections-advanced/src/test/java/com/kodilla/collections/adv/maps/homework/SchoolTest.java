package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {

    private School school;
    private List<Integer> studentsCount;

    @BeforeEach
    void setUp() {
        studentsCount = new ArrayList<>();
        studentsCount.add(30);
        studentsCount.add(31);
        studentsCount.add(29);
        school = new School(studentsCount, "school");
    }

    @Test
    void getStudentsCountSum() {
        assertEquals(90, school.getStudentsCountSum());
    }

    @Test
    void getSchoolsName() {
        assertEquals("school", school.getSchoolsName());
    }

    @Test
    void testToString() {
        assertEquals("School{studentsCount=[30, 31, 29], schoolsName='school'}", school.toString());
    }
}