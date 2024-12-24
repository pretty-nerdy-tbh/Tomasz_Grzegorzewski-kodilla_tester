package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    private Invoice invoice;

    @BeforeEach
    void setup() {
        invoice = new Invoice();
        invoice.addItem(new Item("Apple", 1.20));
        invoice.addItem(new Item("Orange", 6.99));
        invoice.addItem(new Item("Banana", 3.49));
        invoice.addItem(new Item("Pineapple", 9.99));
    }


    @Test
    public void addItemShouldChangeSizeOfTheList() {
        assertEquals(4, invoice.getSize());
    }

    @Test
    public void getItemShouldReturnItem() {
        assertEquals("Banana", invoice.getItem(2).getName());
        assertEquals(3.49, invoice.getItem(2).getPrice());
    }

    @Test
    public void getSizeShouldReturnZeroAfterClean() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }

    @Test
    public void getItemShouldReturnNullIfIndexOutOfRange() {
        assertNull(invoice.getItem(10));
        assertNull(invoice.getItem(-2));
    }

}