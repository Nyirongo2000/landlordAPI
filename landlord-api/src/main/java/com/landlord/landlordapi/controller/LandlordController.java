package com.landlord.landlordapi.controller;

import com.landlord.landlordapi.model.Landlord;
import com.landlord.landlordapi.service.HostelService;
import com.landlord.landlordapi.service.LandlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/landlord")
public class LandlordController {

    private final LandlordService landlordService;
    private final HostelService hostelService;
    @Autowired
    public LandlordController(LandlordService landlordService, HostelService hostelService) {
        this.landlordService = landlordService;
        this.hostelService = hostelService;
    }

    @PostMapping("/landlord")
    public Landlord createLandlord(@RequestBody Landlord landlord ){
        return landlordService.createLandlord(landlord);
    }
    @GetMapping("/landlord")
    public List<Landlord> getAllLandlords(){
        return landlordService.getAllLandlords();
    }

}
