package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void giveVoice() {
        Duck duck = new Duck();
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        duck.giveVoice();
        System.setOut(originalOut);
        String consoleOutput = outputStream.toString().trim();
        assertEquals("Quack", consoleOutput);
    }
}