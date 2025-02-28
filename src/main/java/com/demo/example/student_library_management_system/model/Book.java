package com.demo.example.student_library_management_system.model;

import com.demo.example.student_library_management_system.enums.Category;
import jakarta.persistence.*;
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "pages",nullable = false)
    private int pages;
    @Column(name = "publishername",nullable = false)
    private String publisherName;
    @Column(name = "publisherdate")
    private String publisherDate;
    @Column(name = "category",nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Category category;
    @Column(name = "rackno",nullable = false)
    private String rackNo;
    @Column(name = "availability",nullable = false)
    private boolean availability;

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherDate() {
        return publisherDate;
    }

    public void setPublisherDate(String publisherDate) {
        this.publisherDate = publisherDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
