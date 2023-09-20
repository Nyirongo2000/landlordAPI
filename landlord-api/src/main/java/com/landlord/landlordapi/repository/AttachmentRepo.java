package com.landlord.landlordapi.repository;

import com.landlord.landlordapi.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepo extends JpaRepository <Attachment,String > {


}
