package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;


    public Square(double a) {
        this.a = a;
    }

    @Override
    public void calculateArea() {
        double area;
        area = (this.a * this.a);
        System.out.println("Area of this square is " + area + "cm²");
    }

    @Override
    public void calculateCircumference() {
        double circumference;
        circumference = this.a * 4;
        System.out.println("Circumference of this square is " + circumference + "cm");
    }
}
