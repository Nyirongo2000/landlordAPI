package com.landlord.landlordapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Hostel")
public class HostelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Hostel_name;
    private int timeTaken;
    @Column(length = 200)
    private String description;
    @ManyToOne
    private LandlordEntity landlord;


}
