package com.kodilla.inheritance.homework;

public class WindowsOS extends OperatingSystem{

    public WindowsOS (int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn(){
        System.out.println("Windows Operating System is ON");
    }

    public void turnOff(){
        System.out.println("System is OFF");
    }
}
