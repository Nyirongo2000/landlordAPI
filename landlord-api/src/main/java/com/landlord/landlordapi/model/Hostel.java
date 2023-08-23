package com.landlord.landlordapi.model;

import jakarta.persistence.Column;

public class Hostel {
    private Long id;
    private String name;
    private int timeTaken;
    private String description;

    public Hostel(Long id, String name, int timeTaken, String description) {
        this.id = id;
        this.name = name;
        this.timeTaken = timeTaken;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
