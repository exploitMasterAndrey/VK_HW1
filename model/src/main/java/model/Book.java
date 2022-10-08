package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private Author author;

/*    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }*/
}
