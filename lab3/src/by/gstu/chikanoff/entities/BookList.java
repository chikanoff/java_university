package by.gstu.chikanoff.entities;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private static List<AbstractBook> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public static void add(AbstractBook book){
        books.add(book);
    }

    public static void showBooks(){
        for (AbstractBook book : books) {
            book.show();
        }
    }

}
