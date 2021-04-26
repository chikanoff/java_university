package gstu.chikanoff.entities;

import java.io.Serializable;

public class Order implements Serializable {
    private ReaderLib reader;
    private String librarianName;
    private String bookName;

    public Order(ReaderLib reader, String librarianName, String bookName) {
        this.reader = reader;
        this.librarianName = librarianName;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return reader + ";" + librarianName + ";" + bookName;
    }
}
