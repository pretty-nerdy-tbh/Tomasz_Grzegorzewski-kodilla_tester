package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework.Person;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonSources {

    private Person person;
    private String expected;


    public PersonSources(Person person, String expected) {
        this.person = person;
        this.expected = expected;
    }

    public String getExpected() {
        return expected;
    }

    public Person getPerson() {
        return person;
    }

    static List<PersonSources> providePersonForTestingGetBMI() {
        List<PersonSources> personsList = new ArrayList<>();
        personsList.add(new PersonSources( new Person(2.13, 50.88), "Very severely underweight"));
        personsList.add(new PersonSources( new Person(2.13, 68.88), "Severely underweight"));
        personsList.add(new PersonSources(new Person(1.73, 51.75), "Underweight"));
        personsList.add(new PersonSources(new Person(1.98, 81.46), "Normal (healthy weight)"));
        personsList.add(new PersonSources(new Person(1.96, 99.78), "Overweight"));
        personsList.add(new PersonSources(new Person(1.79, 101.62), "Obese Class I (Moderately obese)"));
        personsList.add(new PersonSources(new Person(1.75, 115.03), "Obese Class II (Severely obese)"));
        personsList.add(new PersonSources(new Person(1.89, 153.42), "Obese Class III (Very severely obese)"));
        personsList.add(new PersonSources(new Person(1.75, 150.76), "Obese Class IV (Morbidly Obese)"));
        personsList.add(new PersonSources(new Person(1.62, 145.83), "Obese Class V (Super Obese)"));
        personsList.add(new PersonSources(new Person(1.42, 137.81), "Obese Class VI (Hyper Obese)"));
        return personsList;
    }
}
