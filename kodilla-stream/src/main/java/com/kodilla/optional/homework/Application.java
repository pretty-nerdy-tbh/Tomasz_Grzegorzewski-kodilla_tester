package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
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

        for (Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }
    }
}
