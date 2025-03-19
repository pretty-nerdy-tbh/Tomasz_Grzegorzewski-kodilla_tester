package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop;
    Order order1 = new Order(23.20, LocalDateTime.parse("2024-12-22T14:30:00"), "redOnion");
    Order order2 = new Order(45.00, LocalDateTime.parse("2024-12-23T10:15:00"), "blueLemon");
    Order order3 = new Order(19.99, LocalDateTime.parse("2024-12-24T18:45:00"), "greenApple");
    Order order4 = new Order(20.00, LocalDateTime.parse("2024-12-25T12:00:00"), "yellowBanana");
    Order order5 = new Order(5.99, LocalDateTime.parse("2024-12-26T08:30:00"), "purpleGrape");
    Order order6 = new Order(150.00, LocalDateTime.parse("2024-12-27T16:00:00"), "orangeCarrot");
    Order order7 = new Order(32.40, LocalDateTime.parse("2024-12-28T19:15:00"), "pinkPeach");
    Order order8 = new Order(60.75, LocalDateTime.parse("2024-12-29T11:00:00"), "blackPlum");
    Order order9 = new Order(12.30, LocalDateTime.parse("2024-12-30T13:20:00"), "whitePear");
    Order order10 = new Order(99.99, LocalDateTime.parse("2024-12-31T21:45:00"), "goldMango");
    Order order11 = new Order(23.20, LocalDateTime.parse("2024-12-22T14:30:00"), "redOnion");


    @BeforeEach
    void setup() throws InvalidOrderException {
        shop = new Shop();
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        shop.addOrder(order8);
        shop.addOrder(order9);
        shop.addOrder(order10);
    }

    @Test
    public void addOrderShouldChangeSizeOfTheList() throws InvalidOrderException{
        shop.addOrder(new Order(199.99, LocalDateTime.parse("2024-01-01T21:45:00"), "rustyPotato"));
        assertEquals(11, shop.getOrdersCount());
    }

    @Test
    public void getOrdersFromTimeSlotShouldReturnExpectedOrders(){
        List<Order> expected = new ArrayList<>();
        expected.add(order2);
        expected.add(order3);

        assertEquals(expected, shop.getOrdersFromTimeSlot(LocalDateTime.parse("2024-12-22T14:30:00"), LocalDateTime.parse("2024-12-25T12:00:00")));
    }

    @Test
    public void getOrdersFromPriceRangeShouldReturnExpectedOrders(){
        List<Order> expected = new ArrayList<>();
        expected.add(order3);
        expected.add(order9);

        assertEquals(expected, shop.getOrdersFromPriceRange(10.00, 20.00));
    }

    @Test
    public void sumOfAllOrdersShouldReturnExpectedResult(){
        assertEquals(469.62, shop.sumOfAllOrders());
    }

    @Test
    public void addOrderShouldThrowExceptionWhenOrderIsInvalid() {
        Order invalidPrice = new Order(-2.22, LocalDateTime.parse("2024-12-22T14:30:00"), "silverCarrot");
        Order invalidDate = new Order(-2.22, LocalDateTime.parse("2024-12-22T14:30:00"), "silverCarrot");
        Order invalidLogin = new Order(-2.22, LocalDateTime.parse("2024-12-22T14:30:00"), "silverCarrot");
        assertThrows(InvalidOrderException.class, () -> shop.addOrder(invalidPrice));
        assertThrows(InvalidOrderException.class, () -> shop.addOrder(invalidDate));
        assertThrows(InvalidOrderException.class, () -> shop.addOrder(invalidLogin));
    }

    @Test
    void toStringShoulReturnRightString() {
        assertEquals("Order{price=23.2, date=2024-12-22T14:30, login='redOnion'}", order11.toString());
    }

    @Test
    void equalsShouldReturnTrue(){
        assertTrue(order1.equals(order11));
    }

}