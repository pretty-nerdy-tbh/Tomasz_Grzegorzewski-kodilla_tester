package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarGarageTest {

    @Test
    public void shouldReturnRightCarForRightSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("rightCarForRightSeason");

        String carType = car.getCarType();
        Boolean headLightsStatus = car.hasHeadlightsTurnedOn(LocalTime.of(10,00));

        List<String> possibleCarTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
        Assertions.assertTrue(headLightsStatus);
    }

    @Test
    public void headLightsShouldBeOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);

        Boolean headLightsStatus = car.hasHeadlightsTurnedOn(LocalTime.of(10,00));

        Assertions.assertTrue(headLightsStatus);
    }

    @Test
    public void headLightsShouldBeOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = context.getBean(Car.class);

        Boolean headLightsStatus = car.hasHeadlightsTurnedOn(LocalTime.of(23,00));

        Assertions.assertFalse(headLightsStatus);
    }

}