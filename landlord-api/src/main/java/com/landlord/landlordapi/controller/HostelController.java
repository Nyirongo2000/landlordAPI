package com.landlord.landlordapi.controller;

import com.landlord.landlordapi.model.Hostel;
import com.landlord.landlordapi.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @GetMapping("/Hostel")
    public List<Hostel> getaAllHostel(){
        return hostelService.getAllHostel();
    }
    @DeleteMapping("/Hostel/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteHostel(@PathVariable Long id){
        boolean deleted = false;
        deleted= hostelService.deleteHostel(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/editHostel/{id}")
    public ResponseEntity<Hostel> updateHostel(@PathVariable Long id,
                                               @RequestBody Hostel hostel){

        hostel=hostelService.updateHostel(id,hostel);
        return ResponseEntity.ok(hostel);
    }


}
