package com.vikas.hotel.hotelManagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ABOUT", length = 25)
    private String about;
}
