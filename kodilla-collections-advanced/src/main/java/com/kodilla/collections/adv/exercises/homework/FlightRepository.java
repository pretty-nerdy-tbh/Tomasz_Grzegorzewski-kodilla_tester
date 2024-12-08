package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add( new Flight("Warsaw", "Berlin"));
        flightsTable.add( new Flight("Berlin", "Warsaw"));
        flightsTable.add( new Flight("Warsaw", "Tokyo"));
        flightsTable.add( new Flight("Tokyo", "Warsaw"));
        flightsTable.add( new Flight("Warsaw", "New York"));
        flightsTable.add( new Flight("Warsaw", "Rio De Janeiro"));
        flightsTable.add( new Flight("Rio De Janeiro", "Tokyo"));
        flightsTable.add( new Flight("Tokyo", "Rio De Janeiro"));
        flightsTable.add( new Flight("Berlin", "New York"));
        flightsTable.add( new Flight("Taipei", "Rio De Janeiro"));
        flightsTable.add( new Flight("Taipei", "New York"));
        flightsTable.add( new Flight("New York", "Taipei"));
        flightsTable.add( new Flight("Taipei", "Berlin"));
        flightsTable.add( new Flight("Taipei", "Warsaw"));
        flightsTable.add( new Flight("Warsaw", "Taipei"));
        return flightsTable;
    }

}
