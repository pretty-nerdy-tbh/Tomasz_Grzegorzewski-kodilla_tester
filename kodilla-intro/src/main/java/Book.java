public class Book {
    static private String author;
    static private String title;

    public static Book of(String author, String title){
        Book book = new Book();
        return book;
    }

    Book book = Book.of("Isaac Asimov", "The Galaxy");
}
