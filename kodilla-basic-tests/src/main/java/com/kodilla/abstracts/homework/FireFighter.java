package com.kodilla.abstracts.homework;

public class FireFighter extends Job{

    public FireFighter(int salary) {
        super(salary, "Fight fire");
    }

    @Override
    public String toString(){
        return "firefighter";
    }
}
