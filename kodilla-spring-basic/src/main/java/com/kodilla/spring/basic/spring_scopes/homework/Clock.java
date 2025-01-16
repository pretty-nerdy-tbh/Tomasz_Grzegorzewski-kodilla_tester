package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Random;

@Component
@Scope("prototype")
public class Clock {

    public LocalTime clock() {
        return LocalTime.now();
    }
}
