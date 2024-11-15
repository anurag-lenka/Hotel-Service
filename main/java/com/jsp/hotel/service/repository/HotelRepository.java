package com.jsp.hotel.service.repository;

import com.jsp.hotel.service.data.entities.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
}
