package com.jsp.hotel.service.data.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "hotel_info")
@Data
public class Hotel {

    @Id
    private String hotelId;

    @Field(value = "name")
    private String name;

    @Field(value = "location")
    private String location;

    @Field(value = "about")
    private String about;
}
