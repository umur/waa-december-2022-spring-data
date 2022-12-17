package miu.edu.waalab3springdata.model;

import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.concurrent.Flow;

public class Book {
    private int id;
    private String name;

    @OneToMany
    private List<BookPublisher> bookPublisherist;

//    private List<Publisher> pubisher;
}
