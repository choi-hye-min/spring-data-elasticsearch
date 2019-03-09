package com.arthur.springbootelasticsearch.domain.repository;

import com.arthur.springbootelasticsearch.domain.Hotel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface HotelRepository extends ElasticsearchRepository<Hotel, String> {
    List<Hotel> findByCity(String city);
}
