package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalProcessorTest {

    @Test
    void process() {
        Dog dog = new Dog();
        assertEquals(4, dog.getNumberOfLegs());
    }
}