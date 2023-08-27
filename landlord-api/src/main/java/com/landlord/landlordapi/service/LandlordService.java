package com.landlord.landlordapi.service;
import com.landlord.landlordapi.model.Hostel;
import com.landlord.landlordapi.model.Landlord;

import java.util.List;

public interface LandlordService {

    Landlord createLandlord(Landlord landlord);

    List<Landlord> getAllLandlords();
}
