package com.vikas.hotel.hotelManagement.services.impl;

import com.vikas.hotel.hotelManagement.entities.Hotel;
import com.vikas.hotel.hotelManagement.exception.ResourceNotFoundException;
import com.vikas.hotel.hotelManagement.repositories.HotelRepository;
import com.vikas.hotel.hotelManagement.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(int hotelId) {
        Optional<Hotel> hotelOptional = hotelRepository.findById(hotelId);
        return hotelOptional.orElseThrow(() -> new ResourceNotFoundException("Hotel not found for requested id : "+hotelId));
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}
