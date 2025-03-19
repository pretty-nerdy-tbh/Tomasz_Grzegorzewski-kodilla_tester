package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BookHackedTest {

    @Test
    void modifyTitle() {
        BookHacked book = new BookHacked("Title", "Author");
        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());

        book.modifyTitle("New Title");
        assertEquals("New Title", book.getTitle());
    }
}