package com.Nail.Library.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Book {
    private int id;

    @NotEmpty(message = "Title should not be empty")
    @Size(min = 2, max = 30, message = "Title should be between 2 and 30 characters")
    private String title;

    @Min(value = -2000, message = "Year should be greater than -2000")
    private int year;

    @NotEmpty(message = "Author should not be empty")
    @Email(message = "Author should be valid")
    private String author;

    public Book() {

    }

    public Book(int id, String title, int year, String author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
