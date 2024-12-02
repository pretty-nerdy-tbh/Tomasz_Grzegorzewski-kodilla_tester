package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Cesarz Karol", 43.00, 31.25, true));
        stamps.add(new Stamp("Poczta miejska w Warszawie", 39.50, 31.25, false));
        stamps.add(new Stamp("Zwycięzcy Challenge-u", 90.00, 70.00, false));
        stamps.add(new Stamp("Cesarz Franciszek", 43.00, 31.25, true));
        stamps.add(new Stamp("Poczta miejska w Warszawie", 39.50, 31.25, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
