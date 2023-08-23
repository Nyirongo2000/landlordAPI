package com.landlord.landlordapi.controller;

import com.landlord.landlordapi.model.Hostel;
import com.landlord.landlordapi.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/landlord")
@RestController
public class HostelController {
   private final HostelService hostelService;
    @Autowired
    public HostelController(HostelService hostelService) {
        this.hostelService = hostelService;
    }
    @PostMapping("/Hostel")
    public Hostel createHostel(@RequestBody Hostel hostel){
        return hostelService.createHostel(hostel);
    }




}
