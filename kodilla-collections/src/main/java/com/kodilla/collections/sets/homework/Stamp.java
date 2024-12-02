package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean stamped;

    public Stamp (String name, double width, double height, boolean stamped){
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamped=" + stamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(width, stamp.width) == 0 && Double.compare(height, stamp.height) == 0 && stamped == stamp.stamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamped);
    }
}
