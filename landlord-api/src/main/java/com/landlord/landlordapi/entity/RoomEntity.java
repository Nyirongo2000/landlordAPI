package com.landlord.landlordapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "Room")
@Entity
public class RoomEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String room_Number;
    private String rType;
    private String rCondition;
}
