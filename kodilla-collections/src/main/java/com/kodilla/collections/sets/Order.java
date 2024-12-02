package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String oredrNumber;
    private String productNumber;
    private double quantity;

    public Order (String oredrNumber, String productNumber, double quantity){
        this.oredrNumber = oredrNumber;
        this.productNumber = productNumber;
        this.quantity = quantity;
    }

    public String getOredrNumber() {
        return oredrNumber;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(quantity, order.quantity) == 0
                && Objects.equals(oredrNumber, order.oredrNumber)
                && Objects.equals(productNumber, order.productNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oredrNumber, productNumber, quantity);
    }

    @Override
    public String toString() {
        return "Order{" +
                "oredrNumber='" + oredrNumber + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
