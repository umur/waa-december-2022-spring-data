package miu.edu.waalab3springdata.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPublisherId {
    private int publisherId;
    private int bookId;
}
