package com.jsp.hotel.service.controller;

import com.jsp.hotel.service.data.dto.ApiResponse;
import com.jsp.hotel.service.data.dto.HotelDTO;
import com.jsp.hotel.service.data.entities.Hotel;
import com.jsp.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody HotelDTO dto){
        return hotelService.saveHotel(dto);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return hotelService.getAllHotels();
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
        return hotelService.getHotel(hotelId);
    }
}
