package com.landlord.landlordapi.model;

public class Landlord {
    private Long id;
    private String LandlordName;
    private String Phone;
    private String Description;

    public Landlord(Long id, String landlordName, String phone, String description) {
        this.id = id;
        LandlordName = landlordName;
        Phone = phone;
        Description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLandlordName() {
        return LandlordName;
    }

    public void setLandlordName(String landlordName) {
        LandlordName = landlordName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
