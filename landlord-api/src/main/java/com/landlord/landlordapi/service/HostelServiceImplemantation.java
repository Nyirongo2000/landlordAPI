package com.landlord.landlordapi.service;

import com.landlord.landlordapi.entity.HostelEntity;
import com.landlord.landlordapi.model.Hostel;
import com.landlord.landlordapi.repository.HostelRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HostelServiceImplemantation implements HostelService {
    private final HostelRepo hostelRepo;
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

    @Override
    public List<Hostel> getAllHostel() {
        List<HostelEntity> hostelEntities=hostelRepo.findAll();
        //taking employee list from the repo and converting it to the UI list
//        looped through the employee list and covert it
        List<Hostel> hostels = hostelEntities
                .stream()
                .map(theHostel -> new Hostel(
                        theHostel.getId(),
                        theHostel.getHostel_name(),
                        theHostel.getTimeTaken(),
                        theHostel.getDescription(),
                        theHostel.getGender(),
                        theHostel.getRentalFee(),
                        theHostel.getNumberOfSingleRooms(),
                        theHostel.getNumberOfDoubleRooms(),
                        theHostel.getTotalNumberOfOtherRooms(),
                        theHostel.getPhoneNumber(),
                        theHostel.getLocation_Name(),
                        theHostel.getLocation_Description(),
                        theHostel.getStudentEmail(),
                        theHostel.getLandlordName(),
                        theHostel.getLandlordDescription()

                ))
                .collect(Collectors.toList());
        return hostels;
    }

    @Override
    public boolean deleteHostel(Long id) {
        HostelEntity hostel = hostelRepo.findById(id).get();
        hostelRepo.delete(hostel);
        return true;
    }

    @Override
    public Hostel updateHostel(Long id, Hostel hostel) {
        HostelEntity hostelEntity
                = hostelRepo.findById(id).get();

        hostelEntity.setHostel_name(hostel.getHostel_name());
        hostelEntity.setDescription(hostel.getDescription());
        hostelEntity.setTimeTaken(hostel.getTimeTaken());

        hostelRepo.save(hostelEntity);
        return hostel;
    }

}
