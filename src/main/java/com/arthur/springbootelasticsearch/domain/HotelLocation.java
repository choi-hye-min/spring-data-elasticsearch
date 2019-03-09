package com.arthur.springbootelasticsearch.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HotelLocation {
    private Double lat;
    private Double lan;

    @Builder
    public HotelLocation(Double lat, Double lan) {
        this.lat = lat;
        this.lan = lan;
    }
}
