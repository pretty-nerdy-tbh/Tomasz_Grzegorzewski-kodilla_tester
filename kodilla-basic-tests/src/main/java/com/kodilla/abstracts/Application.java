package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {
        Animal duck = new Duck();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(duck);
    }
}
