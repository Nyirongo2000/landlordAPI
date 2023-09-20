package com.landlord.landlordapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.landlord.landlordapi.entity.RoomEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
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
//    hostel
    private Long id;
    @Column(name = "hostel_name", nullable = false, length = 90,unique = true)
    private String hostel_name;
    private String gender;
    private String rentalFee;
    @Column(name = "timeItTakes", length = 10)
    private int timeTaken;
    @Column(name = "description", nullable = false, length = 200)
    private String description;

//    private List<RoomEntity> room;
//    Room
//    private String rCondition;
    private int numberOfSingleRooms;
    private int numberOfDoubleRooms;
    @Transient
    private int totalNumberOfOtherRooms;
//    Landlord

@Column(name = "phoneNumber", nullable = false, length = 13)
    private String phoneNumber;
    @Column(name = "landlordName", nullable = false, length = 90)
    private String landlordName;
    private String landlordDescription;
//    Location
private String locationType;
    private String location_Name;

    @Column(name = "Ldescription", nullable = false, length = 200)
    private String Location_Description;
//    student email
    private String StudentEmail;

    @Transient
    public int getTotalNumberOfOtherRooms() {
        return (numberOfSingleRooms + numberOfDoubleRooms);
    }
}
