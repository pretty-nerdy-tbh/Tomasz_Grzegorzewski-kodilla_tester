package com.kodilla.execution_model.homework;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private double price;
    private LocalDateTime date;
    private String login;

    public Order(double price, LocalDateTime date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(price, order.price) == 0 && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date, login);
    }
}
