package com.landlord.landlordapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Landlord")
public class LandlordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String LandlordName;
    private String Phone;
    private String Description;
    @OneToMany(mappedBy = "landlord")
//    @JoinColumn(name = "LandlordName")
    private List<HostelEntity> hostel;


}
