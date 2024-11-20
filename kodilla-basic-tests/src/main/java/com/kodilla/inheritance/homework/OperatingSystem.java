package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease;


    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public void turnOn(){
        System.out.println("System is ON");
    }

    public void turnOff(){
        System.out.println("System is OFF");
    }

    public int getYearOfRelease(){
        return yearOfRelease;
    }
}
