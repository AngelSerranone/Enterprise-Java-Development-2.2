package com.ironhack.classes;

/** Exercise 4: Create a Book class for users who want to track Books that they have read. */

public class Book {
    // Properties
    private String name;
    private String author;
    private int pages;
    private Boolean read;

    // Constructor

    public Book(String name, String author, int pages) {
        setName(name);
        setAuthor(author);
        setPages(pages);
        setRead(false);
    }

    // Make book read
    public void setReadBook() {
        this.read = true;
    }


    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }
}
