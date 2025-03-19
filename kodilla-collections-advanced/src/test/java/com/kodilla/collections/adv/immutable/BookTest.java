package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Title", "Author");
    }

    @Test
    void getTitle() {
        assertEquals("Title", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Author", book.getAuthor());
    }
}