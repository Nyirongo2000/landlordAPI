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
@Table(name = "Landlord")
public class LandlordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String LandlordName;
    private String Phone;
    private String Description;
    @OneToMany(targetEntity = HostelEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="HoLand_fk",referencedColumnName = "id")
    private List<HostelEntity> hostel;


}
