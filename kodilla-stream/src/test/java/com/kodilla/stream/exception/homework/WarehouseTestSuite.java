package com.kodilla.stream.exception.homework;

import com.kodilla.stream.exception.AirportNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException(){
        //given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("00001"));
        warehouse.addOrder(new Order("00002"));
        warehouse.addOrder(new Order("00003"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("00004"));
    }

}