package com.jsp.hotel.service.dao;

import com.jsp.hotel.service.data.entities.Hotel;

import java.util.List;

public interface HotelDAOService {

    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotel(String hotelId);
}
