package miu.edu.waalab3springdata.test;

import jakarta.persistence.*;

@Entity
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person {
    @Id
    private int id;
    private String name;
}
