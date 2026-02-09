package com.example.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String author;

    public Book() {}

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }

    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
}
