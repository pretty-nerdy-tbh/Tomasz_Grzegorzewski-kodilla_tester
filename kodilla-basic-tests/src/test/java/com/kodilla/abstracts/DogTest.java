package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void giveVoice() {
        Dog dog = new Dog();
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        dog.giveVoice();
        System.setOut(originalOut);
        String consoleOutput = outputStream.toString().trim();
        assertEquals("Hau hau", consoleOutput);
    }
}