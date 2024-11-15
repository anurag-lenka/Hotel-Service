package com.jsp.hotel.service.dao.impl;

import com.jsp.hotel.service.dao.HotelDAOService;
import com.jsp.hotel.service.data.entities.Hotel;
import com.jsp.hotel.service.exception.ResourceNotFoundException;
import com.jsp.hotel.service.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelDAOServiceImp implements HotelDAOService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Invalid hotelId"+hotelId));
    }
}
