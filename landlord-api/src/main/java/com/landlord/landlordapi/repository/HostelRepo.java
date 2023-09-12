package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.HostelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HostelRepo extends JpaRepository<HostelEntity,Long> {

    List<HostelEntity> findByLocationType(String locationType);

}
