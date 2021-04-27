package hust.soict.hedspi.test.book;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.addAuthor("hust");
        book.setContent("a a bbb c c c");
        System.out.println(book);
    }
}
