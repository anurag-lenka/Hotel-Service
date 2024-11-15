package com.jsp.hotel.service.service.imp;

import com.jsp.hotel.service.dao.HotelDAOService;
import com.jsp.hotel.service.data.dto.ApiResponse;
import com.jsp.hotel.service.data.dto.HotelDTO;
import com.jsp.hotel.service.data.entities.Hotel;
import com.jsp.hotel.service.service.HotelService;
import com.jsp.hotel.service.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImp implements HotelService {

    @Autowired
    private HotelDAOService hotelDAOService;

    @Override
    public ResponseEntity<Hotel> saveHotel(HotelDTO dto) {
        String id = UUID.randomUUID().toString();
        Hotel hotel = new Hotel();
        hotel.setHotelId(id);
        hotel.setAbout(dto.getAbout());
        hotel.setLocation(dto.getLocation());
        hotel.setName(dto.getName());
        return ResponseEntity.ok(hotelDAOService.saveHotel(hotel));
    }

    @Override
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return ResponseEntity.ok(hotelDAOService.getAllHotels());
    }

    @Override
    public ResponseEntity<Hotel> getHotel(String hotelId) {
        return ResponseEntity.ok(hotelDAOService.getHotel(hotelId));
    }
}
