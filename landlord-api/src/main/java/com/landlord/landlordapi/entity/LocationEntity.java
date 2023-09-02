package com.landlord.landlordapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "location")
public class LocationEntity {
    @Id
    private Long location_Id;
    private String location_name;
    private String description;
    private Long latitude;
    private Long longitude;
    @OneToMany(targetEntity = HostelEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="HoLocation_fk",referencedColumnName = "location_Id")
    private List<HostelEntity> hostel;
//link with google coordinates

}
