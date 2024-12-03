package com.kodilla.collections.adv.maps.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal john = new Principal("John");
        Principal albus = new Principal("Albus");
        Principal jim = new Principal("Bart");

        School johnClasses = new School(Arrays.asList(20, 22, 25, 29, 27), "East High High School");
        School albusClasses = new School(Arrays.asList(21, 24, 28, 30, 17), "Hogwarts School of Witchcraft and Wizardry");
        School jimClasses = new School(Arrays.asList(23, 29, 25, 31, 27), "Forks High School");

        schoolDirectory.put(john, johnClasses);
        schoolDirectory.put(albus, albusClasses);
        schoolDirectory.put(jim, jimClasses);

        for (Map.Entry<Principal, School> schoolEntry : schoolDirectory.entrySet()) {
            System.out.println("Principal: " + schoolEntry.getKey().getName());
            System.out.println("School name: " + schoolEntry.getValue().getSchoolsName());
            System.out.println("Students in school: " + schoolEntry.getValue().getStudentsCountSum());
        }
    }
}
