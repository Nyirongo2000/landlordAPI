package com.landlord.landlordapi.model;

import com.landlord.landlordapi.entity.HostelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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
    private List<HostelEntity> hostel;
}
