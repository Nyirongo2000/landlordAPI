package com.landlord.landlordapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Location {
    private Long location_Id;
    private String location_name;
    private String description;
    private Long latitude;
    private Long longitude;
}
