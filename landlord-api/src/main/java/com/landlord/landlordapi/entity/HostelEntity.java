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
    private String hostel_name;
    private String gender;
    private int timeTaken;
    @Column(length = 200)
    private String description;
    @OneToMany(targetEntity = RoomEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="RoHostel_fk",referencedColumnName = "id")
    private List<RoomEntity> room;



}
