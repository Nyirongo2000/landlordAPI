package com.landlord.landlordapi.model;

import jakarta.persistence.Column;

public class Hostel {
    private Long id;
    private String Hostel_name;
    private int timeTaken;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHostel_name() {
        return Hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        Hostel_name = hostel_name;
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

    public Hostel(Long id, String hostel_name, int timeTaken, String description) {
        this.id = id;
        Hostel_name = hostel_name;
        this.timeTaken = timeTaken;
        this.description = description;
    }
}
