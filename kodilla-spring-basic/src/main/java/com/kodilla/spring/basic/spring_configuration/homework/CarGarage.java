package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarGarage {

    @Bean
    public Car rightCarForRightSeason() {
        Car car;
        String[] seasons = new String[] {"summer", "spring", "winter", "autumn"};
        Random generator = new Random();
        int chosen = generator.nextInt(4);
        String season = seasons[chosen] ;
        if (season == "summer") {
            car = new Cabrio();
        } else if (season == "winter") {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        System.out.println(season);
        return car;
    }
}
