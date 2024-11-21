package com.kodilla.abstracts.homework;

public class Baker extends Job{
    public Baker(int salary) {
        super(salary, "Bake bread");
    }

    @Override
    public String toString(){
        return "baker";
    }
}
