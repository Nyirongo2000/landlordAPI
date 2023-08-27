package com.landlord.landlordapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Room {
    private Long id;
    private String room_Number;
    private String rType;
    private String rCondition;
    private String gender;
}
