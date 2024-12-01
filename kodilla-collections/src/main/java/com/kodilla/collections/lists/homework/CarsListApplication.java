package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Reno;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(30));
        cars.add(new Reno(25));
        cars.add(new Opel(35));

        cars.remove(1);

        Opel opel = new Opel(35);
        cars.remove(opel);

        for (Car car: cars){
            car.increaseSpeed();
            CarUtils.describeCar(car);
        }

        System.out.println("Tablica ma romiar: " + cars.size());
    }
}
