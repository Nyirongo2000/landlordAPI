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
@Table(name = "Hostel")
public class HostelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String hostel_name;
    private String gender; 
    private String rentalFee;
    private int timeTaken;
    @Column(length = 200)
    private String description;
    //undo
//    @OneToMany(targetEntity = RoomEntity.class, cascade = CascadeType.ALL)
//    @JoinColumn(name ="RoHostel_fk",referencedColumnName = "id")
//    private List<RoomEntity> room;
    //some dummy data just to speed up but will eventually come back to fixing the relationship rout
//    private String rCondition;
    private int numberOfSingleRooms;
    private int numberOfDoubleRooms;
    @Transient
    private int totalNumberOfOtherRooms;
    //    Landlord
    private String phoneNumber;
    private String landlordName;
    private String landlordDescription;
    //    Location
    private String locationType;
    private String location_Name;
    private String Location_Description;
    //    student email
    private String StudentEmail;
    @Transient
    public int getTotalNumberOfOtherRooms() {
        return (numberOfSingleRooms + numberOfDoubleRooms);
    }


}
