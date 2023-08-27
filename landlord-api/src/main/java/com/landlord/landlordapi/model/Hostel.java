package com.landlord.landlordapi.model;

import com.landlord.landlordapi.entity.RoomEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Hostel {
    private Long id;
    private String Hostel_name;
    private int timeTaken;
    private String description;
    private List<RoomEntity> room;

}
