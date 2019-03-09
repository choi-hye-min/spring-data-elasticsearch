package com.arthur.springbootelasticsearch;

import com.arthur.springbootelasticsearch.domain.Hotel;
import com.arthur.springbootelasticsearch.domain.repository.HotelRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootElasticsearchApplicationTests {

    @Autowired
    private HotelRepository hotelRepository;

    @Test
    public void contextLoads() {
        List<Hotel> hotels = hotelRepository.findByCity("seoul");

        System.out.println();
    }

}
