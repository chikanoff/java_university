package by.gstu.chikanoff.entities;

import by.gstu.chikanoff.utils.Constants;

public abstract class AbstractBook {
    protected String name;
    protected int year;

    public AbstractBook(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void add(){
        BookList.add(this);
    }

    public void show(){
        System.out.println(name + Constants.DELIMETER + year);
    }
}
