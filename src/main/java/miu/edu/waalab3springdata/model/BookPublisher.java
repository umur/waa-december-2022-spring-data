package miu.edu.waalab3springdata.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class BookPublisher {

    @EmbeddedId
    private BookPublisherId bookPublisherId;
    private LocalDate year;

    @ManyToOne
    private Publisher publisher;

    @ManyToOne
    private Book book;
}
