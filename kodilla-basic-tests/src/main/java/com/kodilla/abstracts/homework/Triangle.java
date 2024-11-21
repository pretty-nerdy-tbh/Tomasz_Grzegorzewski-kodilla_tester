package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void calculateArea() {
        double area;
        area = (this.a * this.h)/3;
        System.out.println("Area of this triangle is " + area + "cm²");
    }

    @Override
    public void calculateCircumference() {
        double circumference;
        circumference = this.a + this.b + this.c;
        System.out.println("Circumference of this triangle is " + circumference + "cm");
    }
}
