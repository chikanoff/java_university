package gstu.chikanoff;

import gstu.chikanoff.entities.Catalog;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Catalog.Note> notes = new ArrayList<>();
        notes.add(new Catalog.Note(new GregorianCalendar(2010,11,20).getTime(), "TITLE1"));
        notes.add(new Catalog.Note(new GregorianCalendar(2011,6,16).getTime(), "TITLE2"));
        notes.add(new Catalog.Note(new GregorianCalendar(2012,2,10).getTime(), "TITLE3"));
        Catalog cat = new Catalog("NAME", notes);

        System.out.println(cat);
    }
}
