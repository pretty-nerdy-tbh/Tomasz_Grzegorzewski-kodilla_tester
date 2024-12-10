package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result  = flightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add( new Flight("Warsaw", "Berlin"));
        expectedList.add( new Flight("Warsaw", "Tokyo"));
        expectedList.add( new Flight("Warsaw", "New York"));
        expectedList.add( new Flight("Warsaw", "Rio De Janeiro"));
        expectedList.add( new Flight("Warsaw", "Taipei"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result  = flightFinder.findFlightsTo("Taipei");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add( new Flight("New York", "Taipei"));
        expectedList.add( new Flight("Warsaw", "Taipei"));
        assertEquals(expectedList, result);
    }

}