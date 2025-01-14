package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(13.0, 12.0);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void shouldReturnCorrectDifference() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(13.0, 12.0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldReturnCorrectProduct() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(3.0, 8.0);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void shouldReturnCorrectQuotient() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(33.0, 11.0);
        Assertions.assertEquals(3, result);
    }

}