package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("00001"));
        warehouse.addOrder(new Order("00002"));
        warehouse.addOrder(new Order("00003"));
        warehouse.addOrder(new Order("00004"));
        warehouse.addOrder(new Order("00005"));
        warehouse.addOrder(new Order("00006"));

        try {
            System.out.println(warehouse.getOrder("00002"));
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no order with that number");
        }
    }
}
