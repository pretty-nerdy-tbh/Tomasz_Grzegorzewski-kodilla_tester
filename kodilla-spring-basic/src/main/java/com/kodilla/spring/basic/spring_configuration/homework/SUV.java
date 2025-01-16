package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime curretTime) {
        LocalTime lightsOFF = LocalTime.of(20, 0);
        LocalTime lightsON = LocalTime.of(6, 0);
        if (curretTime.isAfter(lightsON) && curretTime.isBefore(lightsOFF)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
