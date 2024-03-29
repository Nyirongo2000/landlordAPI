package com.landlord.landlordapi.service;

import com.landlord.landlordapi.model.Hostel;

import java.util.List;

public interface HostelService {
    Hostel createHostel(Hostel hostel);

    List<Hostel> getAllHostel();

    boolean deleteHostel(Long id);

    Hostel updateHostel(Long id, Hostel hostel);

    List<Hostel> getHostelsByLocationType(String locationType);
}
