package com.landlord.landlordapi.model;

import com.landlord.landlordapi.entity.HostelEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Landlord {
   private Long id;
   private String LandlordName;
   private String Phone;
   private String Description;
   private List<HostelEntity> hostel;


}
