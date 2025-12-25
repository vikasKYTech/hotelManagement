package com.vikas.hotel.hotelManagement.services;

import com.vikas.hotel.hotelManagement.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    Hotel getHotel(int hotelId);

    List<Hotel> getHotels();
}
