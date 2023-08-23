package com.landlord.landlordapi.service;

import com.landlord.landlordapi.entity.HostelEntity;
import com.landlord.landlordapi.model.Hostel;
import com.landlord.landlordapi.repository.HostelRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostelServiceImplemantation implements HostelService {
    private HostelRepo hostelRepo;
    @Autowired
    public HostelServiceImplemantation(HostelRepo hostelRepo){ this.hostelRepo=hostelRepo;}


    @Override
    public Hostel createHostel(Hostel hostel) {
        HostelEntity hostelEntity= new HostelEntity();
        //copy values from hostel to hostelEntity
        BeanUtils.copyProperties(hostel,hostelEntity);
        hostelRepo.save(hostelEntity);
        return hostel;
    }
}
