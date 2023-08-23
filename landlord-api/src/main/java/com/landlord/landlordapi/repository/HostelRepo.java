package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.HostelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepo extends JpaRepository<HostelEntity,Long> {

}
