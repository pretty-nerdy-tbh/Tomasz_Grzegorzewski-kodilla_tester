package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Any address", 25.5);
        Assertions.assertEquals("Package delivered to: Any address", message);
    }

    @Test
    public void shouldNotDeliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Any address", 35.5);
        Assertions.assertEquals("Package not delivered to: " + "Any address", message);
    }

}