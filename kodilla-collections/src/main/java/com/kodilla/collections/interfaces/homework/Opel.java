package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return acceleration == opel.acceleration && breaking == opel.breaking && speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceleration, breaking, speed);
    }
}
