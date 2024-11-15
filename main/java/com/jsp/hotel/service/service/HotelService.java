package com.jsp.hotel.service.service;

import com.jsp.hotel.service.data.dto.ApiResponse;
import com.jsp.hotel.service.data.dto.HotelDTO;
import com.jsp.hotel.service.data.entities.Hotel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HotelService {

    ResponseEntity<Hotel> saveHotel(HotelDTO dto);
    ResponseEntity<List<Hotel>> getAllHotels();
    ResponseEntity<Hotel> getHotel(String hotelId);
}
