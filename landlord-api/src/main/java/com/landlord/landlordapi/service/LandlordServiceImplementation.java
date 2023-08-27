package com.landlord.landlordapi.service;

import com.landlord.landlordapi.entity.HostelEntity;
import com.landlord.landlordapi.entity.LandlordEntity;
import com.landlord.landlordapi.model.Landlord;
import com.landlord.landlordapi.repository.LandlordRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LandlordServiceImplementation implements LandlordService {

    private final LandlordRepo landlordRepo;
    @Autowired
    public LandlordServiceImplementation(LandlordRepo landlordRepo) {
        this.landlordRepo = landlordRepo;
    }

    @Override
    public Landlord createLandlord(Landlord landlord) {
        LandlordEntity landlordEntity= new LandlordEntity();
        //copy values from landlord to landlordEntity
        BeanUtils.copyProperties(landlord,landlordEntity);
        landlordRepo.save(landlordEntity);
        return landlord;
    }

    @Override
    public List<Landlord> getAllLandlords() {
        List<LandlordEntity> landlordEntities
                = landlordRepo.findAll();
        List<Landlord> landlord = landlordEntities
                .stream()
                .map(lndlord ->new Landlord(
                        lndlord.getId(),
                        lndlord.getLandlordName(),
                        lndlord.getPhone(),
                        lndlord.getDescription(),
                        lndlord.getHostel()
                ))
                .collect(Collectors.toList());
        return landlord;
    }
}
