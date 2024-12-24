package com.kodilla.execution_model.homework;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) throws InvalidOrderException{
        if (order.getPrice() >= 0 && order.getDate() != null && order.getLogin() != null) {
            this.orders.add(order);
        } else {
            throw new InvalidOrderException();
        }
    }

    public List<Order> getOrdersFromTimeSlot(LocalDateTime startDate, LocalDateTime endDate){
        return this.orders.stream()
                .filter(order -> order.getDate().isAfter(startDate) && order.getDate().isBefore(endDate))
                .collect(Collectors.toList());

    }

    public List<Order> getOrdersFromPriceRange(double startPrice, double endPrice){
        return this.orders.stream()
                .filter(d -> d.getPrice() > startPrice && d.getPrice() < endPrice)
                .collect(Collectors.toList());
    }

    public int getOrdersCount(){
        return orders.size();
    }

    public double sumOfAllOrders(){
        double result = 0;
        for (Order order : this.orders) {
            result += order.getPrice();
        }
        return result;
    }
}
