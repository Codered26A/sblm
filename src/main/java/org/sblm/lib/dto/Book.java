package org.sblm.lib.dto;

import java.util.Date;

public class Book {
    private long id;
    private String name;
    private int price;
    private Date publishingDate;
    private String status; // available,issued,reissued
    private Date statusUpdateDate;
//    private Author author;


    public Book() {
    }

    public Book(String name, int price, Date publishingDate) {
        this.name = name;
        this.price = price;
        this.publishingDate = publishingDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishingDate=" + publishingDate +
                ", status='" + status + '\'' +
                ", statusUpdateDate=" + statusUpdateDate +
                '}';
    }
}
