package com.arthur.springbootelasticsearch.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;



/* Example Document
"name" : "Dong Seoul Hotel",
"stars" : 3,
"rooms" : 115,
"location" : {
    "lat" : 37.534303,
    "lon" : 127.091908
},
"city" : "Seoul",
"address" : "38, Guuigangbyeon-ro, Gwangjin-gu Seoul Seoul 143-200 South Korea",
"price" : 98,
"internet" : true,
"service" : [
    "Coffee shop"
],
"checkin" : "2014-04-02T11:00:00"*/

@Getter
@Setter
@NoArgsConstructor
@Document(indexName = "hotels", type = "hotel")
public class Hotel {
    @Id
    private Long id;
    private String name;
    private Integer stars;
    private Integer rooms;
    private HotelLocation location;
    private String city;
    private String address;
    private Integer price;
    private Boolean internet;
    private List<String> service;
    private String checkin;

    @Builder
    public Hotel(Long id, String name, Integer starts, Integer rooms, HotelLocation location, String city, String address, Integer price, Boolean internet, List<String> service, String checkin) {
        this.id = id;
        this.name = name;
        this.stars = starts;
        this.rooms = rooms;
        this.location = location;
        this.city = city;
        this.address = address;
        this.price = price;
        this.internet = internet;
        this.service = service;
        this.checkin = checkin;
    }
}
