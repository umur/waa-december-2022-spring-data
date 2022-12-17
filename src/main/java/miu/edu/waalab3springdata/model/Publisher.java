package miu.edu.waalab3springdata.model;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Publisher {

    private int id;
    private String publisherName;

    @OneToMany
    private List<BookPublisher> bookPublisherList;

    @ManyToMany
    private List<Book> bookList;
}
