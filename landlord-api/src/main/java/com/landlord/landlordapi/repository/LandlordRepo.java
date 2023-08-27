package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.LandlordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandlordRepo extends JpaRepository<LandlordEntity,Long > {
}
