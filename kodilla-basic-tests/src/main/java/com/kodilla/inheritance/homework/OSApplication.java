package com.kodilla.inheritance.homework;

public class OSApplication {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1956);
        operatingSystem.turnOn();
        System.out.println(operatingSystem.getYearOfRelease());

        MacOS macOS = new MacOS(2001);
        macOS.turnOn();
        System.out.println(macOS.getYearOfRelease());

        WindowsOS windowsOS = new WindowsOS(1985);
        windowsOS.turnOn();
        System.out.println(windowsOS.getYearOfRelease());

        operatingSystem.turnOff();
    }
}
