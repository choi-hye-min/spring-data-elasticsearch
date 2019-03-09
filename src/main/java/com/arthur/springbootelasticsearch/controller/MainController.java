package com.arthur.springbootelasticsearch.controller;

import com.arthur.springbootelasticsearch.domain.Hotel;
import com.arthur.springbootelasticsearch.domain.HotelLocation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/")
    public ResponseEntity index() {
        List<String> services = new ArrayList<>();
        services.add("Coffee Shop");

        Hotel hotel = Hotel.builder()
                .address("Seoul Korea 2123-1233")
                .checkin(LocalDateTime.now().toString())
                .city("Seoul")
                .location(HotelLocation.builder()
                        .lat(37.534303)
                        .lan(127.091908)
                        .build())
                .service(services)
                .internet(true)
                .price(95)
                .starts(4)
                .name("Arthur Seoul Hotel")
                .rooms(100)
                .build();

        return new ResponseEntity(hotel, HttpStatus.OK);
    }
}
