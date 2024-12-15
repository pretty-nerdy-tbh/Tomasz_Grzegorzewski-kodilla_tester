package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> result = this.orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .collect(Collectors.toList());
        if (result.size() > 0)
            return result.get(0);
        throw new OrderDoesntExistException();
    }
}
