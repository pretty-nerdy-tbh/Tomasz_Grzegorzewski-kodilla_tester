package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int acceleration;
    private int breaking;
    private int speed;

    public Opel(int acceleration){
        this.acceleration = acceleration;
        this.breaking = 12;
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + this.acceleration;
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed > 0 || this.speed - this.breaking > 0) {
            this.speed = this.speed - this.breaking;
        } else {
            this.speed = 0;
        }
    }
}
