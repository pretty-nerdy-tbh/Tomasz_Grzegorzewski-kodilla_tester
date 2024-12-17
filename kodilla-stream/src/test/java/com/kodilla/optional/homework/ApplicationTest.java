package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    private List<Student> students;

    @BeforeEach
    void setup() {
        students = new ArrayList<>();
        students.add(new Student("Janek", new Teacher("Olga")));
        students.add(new Student("Agata", new Teacher("Janusz")));
        students.add(new Student("Zofia", new Teacher("Kazimierz")));
        students.add(new Student("Kasia", null));
        students.add(new Student("Stasiek", null));
        students.add(new Student("Maria", null));
    }

    @Test
    public void testGetTeacherName() {
        List<Teacher> expectedList = new ArrayList<>();
        expectedList.add(new Teacher("Olga"));
        expectedList.add(new Teacher("Janusz"));
        expectedList.add(new Teacher("Kazimierz"));
        expectedList.add(new Teacher("<undefined>"));
        expectedList.add(new Teacher("<undefined>"));
        expectedList.add(new Teacher("<undefined>"));

        List<Teacher> testList = new ArrayList<>();

        for (Student student : students){
            testList.add(new Teacher(student.getTeacherName()));
        }

        assertEquals(testList, expectedList);
    }


}