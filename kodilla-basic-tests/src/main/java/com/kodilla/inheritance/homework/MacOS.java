package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS (int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn(){
        System.out.println("Mac Operating System is ON");
    }

    public void turnOff(){
        System.out.println("System is OFF");
    }

}
