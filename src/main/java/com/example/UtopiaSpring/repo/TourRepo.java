package com.example.UtopiaSpring.repo;

import com.example.UtopiaSpring.model.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepo extends MongoRepository<Tour, String> {
    List<Tour> findByslugRegex(String s, String search);

    List<Tour> findByDays(Integer d, Integer days);

    List<Tour> findByPlaces(String s, String search);

    List<Tour> findByInclusions(String s, String search);
}