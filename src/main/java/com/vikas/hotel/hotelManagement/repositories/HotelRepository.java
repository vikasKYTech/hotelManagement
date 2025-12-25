package com.vikas.hotel.hotelManagement.repositories;

import com.vikas.hotel.hotelManagement.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "hotel")
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
