package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void loopForEveryStudent() {
        Teacher profSipowicz = new Teacher("Olga");
        Teacher profPanasewicz = new Teacher("Janusz");
        Teacher profStaszewski = new Teacher("Kazimierz");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Janek", profPanasewicz));
        students.add(new Student("Kasia", null));
        students.add(new Student("Stasiek", null));
        students.add(new Student("Tomek", profPanasewicz));
        students.add(new Student("Maria", null));
        students.add(new Student("Marek", profSipowicz));
        students.add(new Student("Agata", profStaszewski));
        students.add(new Student("Zofia", profSipowicz));

        int i = 0;

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
            i = i + 1;
        }

        assertEquals(students.size(), i);
    }

    @Test
    public void nullCount() {
        Teacher profSipowicz = new Teacher("Olga");
        Teacher profPanasewicz = new Teacher("Janusz");
        Teacher profStaszewski = new Teacher("Kazimierz");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Janek", profPanasewicz));
        students.add(new Student("Kasia", null));
        students.add(new Student("Stasiek", null));
        students.add(new Student("Tomek", profPanasewicz));
        students.add(new Student("Maria", null));
        students.add(new Student("Marek", profSipowicz));
        students.add(new Student("Agata", profStaszewski));
        students.add(new Student("Zofia", profSipowicz));

        int i = students.size();

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
            if (optionalTeacher.isPresent())
                i = i - 1;
        }

        assertEquals(3, i);
    }

    @Test
    public void returnSpecificStudents() {
        Teacher profSipowicz = new Teacher("Olga");
        Teacher profPanasewicz = new Teacher("Janusz");
        Teacher profStaszewski = new Teacher("Kazimierz");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Janek", profPanasewicz));
        students.add(new Student("Kasia", null));
        students.add(new Student("Stasiek", null));
        students.add(new Student("Tomek", null));
        students.add(new Student("Maria", null));
        students.add(new Student("Marek", null));
        students.add(new Student("Agata", profStaszewski));
        students.add(new Student("Zofia", profSipowicz));

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student("Janek", profPanasewicz));
        expectedList.add(new Student("Agata", profStaszewski));
        expectedList.add(new Student("Zofia", profSipowicz));

        List<Student> tetsList = new ArrayList<>();

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            if (teacherName != "<undefined>")
                tetsList.add(student);
        }

        assertEquals(tetsList, expectedList);
    }
}