package com.kodilla.abstracts.homework;

public class TesterQA extends Job{

    public TesterQA(int salary) {
        super(salary, "Assure quality");
    }

    @Override
    public String toString(){
        return "tester QA";
    }
}
