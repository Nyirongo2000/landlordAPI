package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<LocationEntity,Long> {

}
