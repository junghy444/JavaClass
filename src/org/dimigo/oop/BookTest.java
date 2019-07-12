package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book();

        System.out.println(book);
        System.out.println(book2);
        System.out.println();

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        book.setTitle("책이름");
        book.setAuthor("작가");
        book.setPage(10);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());

        Book book3 = new Book();
        System.out.println(book3.getTitle());
    }
}
