package com.vikas.hotel.hotelManagement.controller;

import com.vikas.hotel.hotelManagement.entities.Hotel;
import com.vikas.hotel.hotelManagement.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @PostMapping("/saveHotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable(name = "id") int hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }

    @PostMapping("/getHotels")
    public ResponseEntity<List<Hotel>> getHotels(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotels());
    }
}
