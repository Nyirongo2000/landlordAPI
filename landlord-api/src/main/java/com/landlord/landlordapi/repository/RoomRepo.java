package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<RoomEntity,Long> {
}
