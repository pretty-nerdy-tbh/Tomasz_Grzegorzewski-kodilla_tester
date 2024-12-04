package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("John Stewart", "The last chance");
        BookRecord bookRecord = new BookRecord("test", "testowa pozycja", 2022);
        BookHacked bookHacked = new BookHacked("John Stewart", "The last chance");

        book = bookHacked;
        bookHacked.modifyTitle("Stewart little");
        System.out.println(book.getTitle());
    }
}
