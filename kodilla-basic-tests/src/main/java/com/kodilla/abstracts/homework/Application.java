package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5,6);
        triangle.calculateArea();
        triangle.calculateCircumference();

        Square square = new Square(6);
        square.calculateArea();
        square.calculateCircumference();

        Job testerQA = new TesterQA(6000);

        Person person = new Person("Tomek", 25, testerQA);
        person.showResponsibilities();
    }
}
