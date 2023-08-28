package com.landlord.landlordapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
//link with google coordinates

}
