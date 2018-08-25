package com.spring.basics.springtutorialbasics;

public class Book {
    enum cover{
        Bundle, Hardcover, Paperback;
    }
    int id;
    String name;
    String Author;
    cover format;

    public Book(int id, String name, String author, cover format) {
        this.id = id;
        this.name = name;
        Author = author;
        this.format = format;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public cover getFormat() {
        return format;
    }

    public void setFormat(cover format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", format=" + format +
                '}';
    }
}
