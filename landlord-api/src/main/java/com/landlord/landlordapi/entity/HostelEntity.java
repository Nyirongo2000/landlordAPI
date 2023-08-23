package com.landlord.landlordapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Hostel")
public class HostelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int timeTaken;
    @Column(length = 200)
    private String description;

    @Override
    public String toString() {
        return "Hostel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timeTaken=" + timeTaken +
                ", description='" + description + '\'' +
                '}';
    }
}
