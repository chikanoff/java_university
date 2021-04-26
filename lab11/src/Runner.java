import by.gstu.chikanoff.entities.*;

import java.util.ArrayList;
import java.util.List;

import static by.gstu.chikanoff.entities.BookList.add;

public class Runner {
    public static void main(String[] args) {
        BookList books = new BookList();
        add(new Book("Mertvie dushi", 2000));
        add(new Magazine("Sovetskaya pravda", 2015));
        add(new PrintEdition("Melanholiya", 2017));
        add(new TextBook("Kirovvv", 2004));
        BookList.showBooks();
    }
}
